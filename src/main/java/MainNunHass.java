package main.java;

import java.util.HashMap;
import java.util.Map.Entry;


public class MainNunHass {

    public static void main(String[]args){
        HashMap<Integer, String> ejemploHash = new HashMap<>();

        ejemploHash.put(1,"Uno");
        ejemploHash.put(2,"Dos");
        ejemploHash.put(3,"Tres");
        ejemploHash.put(4,"Cuatro");
        ejemploHash.put(5,"Cinco");



        //System.out.println(ejemploHash.size());

        for (Entry<Integer, String> var :ejemploHash.entrySet()) {
            System.out.println(var.getKey().toString()+" - "+var.getValue());

        }
    }


}
