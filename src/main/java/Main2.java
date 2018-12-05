package main.java;

import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[]args){
        List<String> lista = new ArrayList<>();
        lista.add("Franz");
        lista.add("Angelo");
        lista.add("Alex");
        lista.add("Luis");
        lista.add("Roger");


        //imprimir toda la lista
        /*for (String var:lista){
            System.out.println(var);
        }*/
        // imprimir solo una posicion 4
        /* System.out.println(lista.get(4)); */
        //eliminar un dato
        lista.remove(2);
        for (String m:lista) {
            System.out.println(m);
        }
    }

}
