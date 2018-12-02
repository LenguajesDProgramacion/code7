package main.java;

public class Persona  {
    private String nombre;
    private String apellido;
    private String ci;
    private int edad;

    public Persona(String nombre, String apellido, String ci, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
