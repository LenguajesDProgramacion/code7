package main.java;

import java.util.HashMap;
import java.util.Map.Entry;

public class ordenar {


    public static void main(String[]args){

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();


        hashMap.put("uno", 1);
        hashMap.put("dos", 2);
        hashMap.put("tres", 3);
        hashMap.put("cuatro", 4);


        //loop HashMap

        for (Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }


}
