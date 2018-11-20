public class Electrodomestico {
    protected String marca;
    protected String modelo;
    protected String color;
    protected int peso;
    protected int garantia;

    public Electrodomestico(String marca, String modelo, String color, int peso, int garantia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.peso = peso;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getPeso() {
        return peso;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getCapocidadMaxima (int capacidad){
        if(capacidad>= 100){
            System.out.print("La capacidad maxima es: 100 ");
        }else {
            System.out.print("la capacidad es correcta ");
        }
        return capacidad;
    }
}
