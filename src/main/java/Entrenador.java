public abstract class Entrenador extends SeleccionFutbol{

    public int idFederacion;

    public Entrenador(int id, String nombre, String apellodo, int edad, int idFederacion) {
        super(id, nombre, apellodo, edad);
        this.idFederacion = idFederacion;
    }

    abstract void planificarEntrenamiento();


}
