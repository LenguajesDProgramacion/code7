public class Lavadora extends Electrodomestico{

    public int capacidad;

    public Lavadora(String marca, String modelo, String color, int peso, int garantia, int capacidad) {
        super(marca, modelo, color, peso, garantia);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int getCapocidadMaxima (int capacidad){
        if(capacidad>= 100){
            System.out.print("La capacidad maxima es: 100 ");
        }else {
            System.out.print("la capacidad es correcta ");
        }
        return capacidad;
    }

}
