public class GrupoB extends Cliente {

    public double montoapagar;

    public GrupoB(String nombre, int clavecliente, double montoapagar) {
        super(nombre, clavecliente);
        this.montoapagar = montoapagar;
    }


    public double totalpagar(){

        return (montoapagar>=10000 ? montoapagar*0.95:montoapagar);

    }
}
