import org.junit.Test;

import static org.junit.Assert.*;

public class LavadoraTest {

    @Test
    public void getCapocidadMaxima() {
        Electrodomestico electrodomestico = new Electrodomestico("LG","2000XL","Blanco",250,2015);
        Electrodomestico electrodomestico1 = new Lavadora("SAMSUN","1522FR","Blanco",100,2016,100);
        Electrodomestico electrodomestico2 = new Licuadora("Patito","ZZZ2000","Rojo",300,20,"1.22mx3.20");

        electrodomestico.getCapocidadMaxima(90);

    }
}