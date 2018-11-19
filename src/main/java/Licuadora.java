public class Licuadora extends Electrodomestico {

    protected String tamaño;


    public Licuadora(String marca, String modelo, String color, int peso, int garantia, String tamaño) {
        super(marca, modelo, color, peso, garantia);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
