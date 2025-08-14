/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concesionaria;

/**
 *
 * @author abeta
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;


    public Vehiculo (String marca, String modelo, int anio, double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.precio=precio;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public abstract double calcularDescuento();


    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: " + precio);
    }
}
