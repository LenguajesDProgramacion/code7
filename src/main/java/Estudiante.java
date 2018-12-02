package main.java;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, String apellido, String ci, int edad) {
        super(nombre, apellido, ci, edad);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}

