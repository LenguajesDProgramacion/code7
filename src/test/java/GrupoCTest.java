import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupoCTest {

    @Test
    public void totalpagar(){
        Cliente cliente1 = new GrupoA("Juan",123,10500);
        Cliente cliente2 = new GrupoB("Sofia",145,2);
        Cliente cliente3 = new GrupoC("Andrea",25,20000);

        cliente1.totalpagar();
        cliente2.totalpagar();
        cliente3.totalpagar();

        System.out.print(cliente1.totalpagar()+"\n");
        System.out.print(cliente2.totalpagar()+"\n");
        System.out.print(cliente3.totalpagar()+"\n");



    }

}