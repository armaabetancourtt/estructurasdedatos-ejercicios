/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concesionaria;

/**
 *
 * @author abeta
 */
public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.87;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Auto");
    }
}
