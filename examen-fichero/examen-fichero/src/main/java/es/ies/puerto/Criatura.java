package es.ies.puerto;

import java.io.Serializable;
import java.util.Objects;

public class Criatura implements Serializable{
    private String id;
    private String nombre;
    private String descripcion;
    private String origen;
    private int fuerza;

    /**
     * Constructor de la clase Criatura con el parametro id
     * @param id de la criatura
     */
    public Criatura(String id){
        this.id = id;
    }

    /**
     * contructor de la clase criatura con todos los parametros
     * @param id de la criatura
     * @param nombre de la criatura
     * @param descripcion de la criatura
     * @param origen de la criatura
     * @param fuerza de la criatura
     */
    public Criatura(String id, String nombre, String descripcion, String origen, int fuerza) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.origen = origen;
        this.fuerza = fuerza;
    }

    /** GETTERS */
    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getOrigen() {
        return this.origen;
    }

    public int getFuerza() {
        return this.fuerza;
    }
  

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Criatura)) {
            return false;
        }
        Criatura criatura = (Criatura) o;
        return Objects.equals(id, criatura.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return id +"," + nombre + "," + descripcion + "," + origen + "," + fuerza;
    }

}