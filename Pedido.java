package org.example;



import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Envio envio;
    private Pago pago;
    private String estado;

    // Constructor
    public Pedido(Cliente cliente, List<Producto> productos, Envio envio, Pago pago, String estado) {
        this.cliente = cliente;
        this.productos = productos;
        this.envio = envio;
        this.pago = pago;
        this.estado = estado;
    }

    // Getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

