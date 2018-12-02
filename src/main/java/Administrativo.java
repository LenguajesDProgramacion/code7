package main.java;

import java.util.List;
import java.util.ArrayList;


public class Administrativo  extends Persona {
    private List<Estudiante> estudianteList = new ArrayList<>();
    private List<Docente> docenteList = new ArrayList<>();
    private List<Materia> materiaList = new ArrayList<>();

    public Administrativo(String nombre, String apellido, String ci, int edad) {
        super(nombre, apellido, ci, edad);
    }

    public void assignarMateriaDoc(List<Docente> docenteList, List<Materia> materiaList){
        try {
            for (Docente docente: docenteList) {
                for (Materia materia: materiaList) {
                    if (!materia.isAsignado()){
                        docente.addMateria(materia);
                        for (Materia materia1:docente.getMateriaList()) {
                            System.out.println("El docente "+docente.getNombre()
                                    +" tiene asignada la materia: "+ materia.getNombre());

                        }
                    }break ;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

