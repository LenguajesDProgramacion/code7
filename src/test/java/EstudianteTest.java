import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EstudianteTest {
    @Test
    public void estudiante () {
        Estudiante estudiante = new Estudiante("Tania", "Lopez", 789878, 26);
        Materia materia1 = new Materia("Ingles", "123A", 55);
        Materia materia2 = new Materia("Lenguaje", "123B", 98);
        Materia materia3 = new Materia("Fisica", "123C", 87);


        List<Materia> m = new ArrayList<>();
        m.add(materia1);
        m.add(materia2);
        m.add(materia3);

        System.out.println(estudiante.getNota(55, m));
    }
        @Test
        public void estudianteNota(){
            Estudiante estudiante1 = new Estudiante("Marvin","Fernandez",9506285,23);
            Materia materia = new Materia("Lenguajes de Programacion","SIS302",100);

            List<Materia> m = new ArrayList<>();
            m.add(materia);

            int expect= (100);
            int actual= estudiante1.notaMinima("SIS302",100,m);
            Assert.assertEquals(expect,actual);
        }

        //Assert.assertEquals(("123C"+"\n"+"Fisica"+"\n"+87.0),estudiante.getMateria("123C",m));
    }
