package main.java;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    private List<Materia> materiaList = new ArrayList<>();

    public List<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(List<Materia> materiaList) {
        this.materiaList = materiaList;
    }

    public Docente(String nombre, String apellido, String ci, int edad) {
        super(nombre, apellido, ci, edad);
    }

    public void addMateria(Materia materia){
        materiaList.add(materia);
    }
}

