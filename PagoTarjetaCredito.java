package org.example;



public class PagoTarjetaCredito implements Pago {
    private double monto;

    // Constructor
    public PagoTarjetaCredito(double monto) {
        this.monto = monto;
    }

    @Override
    public String getTipoPago() {
        return "Tarjeta de Crédito";
    }

    @Override
    public double getMonto() {
        return monto;
    }
}