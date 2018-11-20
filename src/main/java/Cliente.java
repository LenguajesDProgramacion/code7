public abstract class Cliente {

    public String nombre;
    public int clavecliente;


    public Cliente(String nombre, int clavecliente) {
        this.nombre = nombre;
        this.clavecliente = clavecliente;

    }

    public abstract double totalpagar();
}
