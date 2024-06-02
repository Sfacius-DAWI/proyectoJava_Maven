package org.example;

public class ProductoConcreto extends Producto {

    // Constructor
    public ProductoConcreto(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("modelo.Producto: " + getNombre() + ", Precio: " + getPrecio() + ", Stock: " + getStock());
    }
}
