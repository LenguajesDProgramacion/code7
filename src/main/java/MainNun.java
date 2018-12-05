package main.java;
import java.util.ArrayList;
import java.util.List;

public class MainNun {


    public static void main(String[]args){
        List<String> numeros = new ArrayList<>();

        numeros.add("100");
        numeros.add("101");
        numeros.add("102");
        numeros.add("103");
        numeros.add("104");
        numeros.add("105");

        for (String var:numeros ){
            System.out.println(var);
        }
    }

}
