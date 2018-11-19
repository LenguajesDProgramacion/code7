public class GrupoA extends Cliente {


    public double montoapagar;

    public GrupoA(String nombre, int clavecliente, double montoapagar) {
        super(nombre, clavecliente);
        this.montoapagar = montoapagar;
    }


    public double totalpagar(){

        return (montoapagar>=10000 ? montoapagar*0.9:montoapagar);

    }
}
