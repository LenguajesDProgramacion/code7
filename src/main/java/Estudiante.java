

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{
    private List<Materia>materias;

    public Estudiante(String nombre, String apellido, int ci, int edad) {
        super(nombre, apellido, ci, edad);
        this.materias = new ArrayList<>();
    }
    public void addMateria (Materia materia){
        this.materias.add(materia);
    }
    public String getNota(int key, List<Materia>materias) {
        String detalle = "";
        for (Materia materia:materias){
           if (materia.getKey().equals(key)){
                detalle = materia.getKey()+"\n"+materia.getNombre()+"\n"+materia.getNota();
                break;
            }
        }
        return  detalle;

    }
    public int notaMinima(String key, int nota ,List<Materia>materias){
        for(Materia materia:materias){
            if(nota <=51){
                System.out.println("Estas reprobado");
            }else{
                System.out.println("Estas aprobado");
            }
        }
        return nota;
    }

    public int getNotaMin(){
        int notaMinima =100;
        for (Materia materia: this.materias){
            if (materia.getNota()<= notaMinima){
                notaMinima = materia.getNota();

            }
        }
        return  notaMinima;
    }
}
