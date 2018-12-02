package main.java;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private  String sigla;
    private  int nota;
    private List<Estudiante> estudianteList = new ArrayList<>();
    private boolean asignado;

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    private List<Materia> materiaList = new ArrayList<>();

    public Materia(String nombre, String sigla, int nota, boolean asignado) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.nota = nota;
        this.asignado = asignado;
    }

    public void addMateria(Materia materia){
        this.materiaList.add(materia);
    }

    public void deleteMateria(Materia materia){
        try {
            for (Materia materia1: materiaList) {
                if (materia.getNombre().equals(materia)){
                    this.materiaList.remove(materia);
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}

