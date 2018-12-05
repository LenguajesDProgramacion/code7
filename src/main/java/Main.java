package main.java;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[]args){
        HashMap<String, String> ejemploHash = new HashMap<>();
        ejemploHash.put("Franz","Salinas");
        ejemploHash.put("Angello","Valdivia");
        ejemploHash.put("Alex","Roman");
        ejemploHash.put("Luis","Castellon");
        ejemploHash.put("Vladimir","Fernandes");
        ejemploHash.put("Raul","Delgado");
        ejemploHash.put("Rojer","Rodriguez");

        for (Map.Entry var:ejemploHash.entrySet()) {
            System.out.println("Nombre: " + var.getKey()+"\n"+"Apellido: "+var.getValue());

        }
    }

}
