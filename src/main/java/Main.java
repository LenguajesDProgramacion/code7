package main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Administrativo administrativo = new Administrativo
                ("Sofia", "Terceros", "7854877", 32);

        Docente docente1 = new Docente("doc1","ap", "157888", 34);
        Docente docente2 = new Docente("doc2","ap", "157888", 34);
        Docente docente3 = new Docente("doc3","ap", "157888", 34);
        Docente docente4 = new Docente("doc4","ap", "157888", 34);
        Docente docente5 = new Docente("doc5","ap", "157888", 34);

        Materia materia1 = new Materia("mat1", "M1", 50, false);
        Materia materia2 = new Materia("mat1", "M2", 50, false);
        Materia materia3 = new Materia("mat1", "M3", 50, false);
        Materia materia4 = new Materia("mat1", "M4", 50, false);
        Materia materia5 = new Materia("mat1", "M5", 50, false);

        List<Docente> docenteList = new ArrayList<>();
        docenteList.add(docente1);
        docenteList.add(docente2);
        docenteList.add(docente3);
        docenteList.add(docente4);
        docenteList.add(docente5);

        List<Materia> materiaList = new ArrayList<>();
        materiaList.add(materia1);
        materiaList.add(materia2);
        materiaList.add(materia3);
        materiaList.add(materia4);
        materiaList.add(materia5);

        administrativo.assignarMateriaDoc(docenteList, materiaList);
    }
}

