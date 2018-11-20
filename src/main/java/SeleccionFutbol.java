public abstract class SeleccionFutbol {

    private int id;
    private String nombre;
    private String apellodo;
    private int edad;

    public SeleccionFutbol(int id, String nombre, String apellodo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellodo = apellodo;
        this.edad = edad;
    }

    abstract boolean concentrarse();
    abstract boolean viajar();
    abstract void entrenar();
    abstract void jugarPartido();

}
