package es.ies.puerto.fichero.examen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import es.ies.puerto.Criatura;

public class FileOpearations {

    public static Map<String, Criatura> read(File file) {
        Map<String, Criatura> criaturas = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datos = line.split(",");
                Criatura criatura = new Criatura(datos[0], datos[1], datos[2], datos[3], Integer.valueOf(datos[4]));
                criaturas.putIfAbsent(criatura.getId(), criatura);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " +
                    e.getMessage());
        }
        return criaturas;
    }

    public static boolean create(Map<String, Criatura> criaturas, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (Criatura criatura : criaturas.values()) {
                writer.write(criatura.toString());
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " +
                    e.getMessage());
        }
        return false;
    }

}
