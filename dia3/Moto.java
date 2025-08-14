package Concesionaria;

/**
 *
 * @author abeta
 */
public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.15;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Moto");
    }
}
