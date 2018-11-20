public abstract class Masajista extends SeleccionFutbol {
    public String titulacion;
    public int aniosExperiencia;

    public Masajista(int id, String nombre, String apellodo, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellodo, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public abstract void darMsaje();
}
