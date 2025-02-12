package es.ies.puerto.fichero.examen;

import java.io.File;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    
    
    public static boolean existeFichero(String nombreFichero) {
        if (nombreFichero == null || nombreFichero.isEmpty() || nombreFichero.isBlank()) {
            return false;
        }
        
        File fichero = new File(nombreFichero); 
        if (!fichero.exists()) {
            return false;
        }

        return true;
    }
}