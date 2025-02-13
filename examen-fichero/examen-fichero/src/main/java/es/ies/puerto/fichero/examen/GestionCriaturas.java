package es.ies.puerto.fichero.examen;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Map;

import es.ies.puerto.Criatura;

public class GestionCriaturas extends FileOpearations {

    File fichero;
    private final String FICHERO = "src/main/resources/criaturas.txt";
    String path = "examen-fichero/examen-fichero/criaturas.txt";

    public GestionCriaturas() {
        URL source = getClass().getClassLoader().getResource(FICHERO);
        try {
            fichero = new File(source.toURI());
            if (!fichero.exists() || !fichero.isFile()) {
                throw new IllegalArgumentException("El recurso no es de tipo fichero" + path);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public boolean insertar(Criatura criatura) {
        if (criatura == null || criatura.getId() == null || criatura.getId().isEmpty()) {
            return false;
        }
        Map<String, Criatura> criaturas = read(fichero);
        if (criaturas.containsValue(criatura)) {
            return false;
        }
        criaturas.putIfAbsent(criatura.getId(), criatura);
        return create(criaturas, fichero);
    }

    public boolean borrar(String id) {
        if (id == null || id.isEmpty() || id.isBlank()) {
            return false;
        }
        return false;
    }

    public List<Criatura> obtenerCriaturas() {
        return null;
    }

    public void modificar(Criatura nuevaModificada) {

    }

    public Criatura buscar(String id) {
        return null;
    }

    public List<Criatura> buscarPorNombre(String nombre) {
        return null;
    }

    public List<Criatura> buscarPorOrigen(String origen) {
        return null;
    }
}
