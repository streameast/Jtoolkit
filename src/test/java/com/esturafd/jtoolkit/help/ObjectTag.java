package com.esturafd.jtoolkit.help;

public class ObjectTag {
    
    private String nombre;
    private int edad;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString() {
        return nombre + " - " + edad;
    }
}
