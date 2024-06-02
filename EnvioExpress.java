package org.example;


public class EnvioExpress implements Envio {
    private String direccionEnvio;
    private double costoEnvio;
    private String tipoEnvio;

    // Constructor
    public EnvioExpress(String direccionEnvio, double costoEnvio) {
        this.direccionEnvio = direccionEnvio;
        this.costoEnvio = costoEnvio;
        this.tipoEnvio = "Express";
    }

    @Override
    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    @Override
    public double getCostoEnvio() {
        return costoEnvio;
    }

    @Override
    public String getTipoEnvio() {
        return tipoEnvio;
    }
}

