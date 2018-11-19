public abstract class Futbolista extends SeleccionFutbol{
    public int dorsal;
    public String demarcacion;

    public Futbolista(int id, String nombre, String apellodo, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellodo, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public abstract void entrvista();

}
