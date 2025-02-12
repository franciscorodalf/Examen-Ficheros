package es.ies.puerto.fichero.examen;

import java.io.File;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean existeDirectorio(String nombreDirectorio) {
        if (nombreDirectorio == null || nombreDirectorio.isEmpty() || nombreDirectorio.isBlank()) {
            return false;
        }
        File directorio = new File(nombreDirectorio);

        if (!directorio.isDirectory()) {
            return false;
        }

        if (!directorio.exists()) {
            return false;
        }
        return true;
    }
}