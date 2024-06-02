package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import okhttp3.*;


public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123", "555-1234", "juan@example.com");

        // Crear productos
        Producto producto1 = new ProductoConcreto("Laptop", 1000.0, 10);
        Producto producto2 = new ProductoConcreto("Smartphone", 500.0, 20);

        // Lista de productos en el pedido
        List<Producto> productosPedido = new ArrayList<>();
        productosPedido.add(producto1);
        productosPedido.add(producto2);

        // Crear un envío
        Envio envio = new EnvioExpress("Calle Falsa 123", 50.0);

        // Crear un pago
        Pago pago = new PagoTarjetaCredito(1700.0);

        // Crear un pedido
        Pedido pedido = new Pedido(cliente1, productosPedido, envio, pago, "Pendiente");

        Double precioaenviar = producto1.getPrecio();
        MyRequestBody requestBodyObject = new MyRequestBody(precioaenviar);

        // Convertir el objeto a JSON
        Gson gson = new Gson();
        String jsonString = gson.toJson(requestBodyObject);
       
       
 


      OkHttpClient client = new OkHttpClient();

        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(jsonString, JSON);
        Request request = new Request.Builder()
                .url("http://localhost:3001/aeai-api/chat/modelo/v1")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                } else {
                    // Do something with the response.
                    System.out.println(response.body().string());
                }
            }
        });


        // Procesar el pedido
        procesarPedido(pedido);
    }

    public static void procesarPedido(Pedido pedido) {
        // Validar stock
        for (Producto producto : pedido.getProductos()) {
            if (producto.getStock() <= 0) {
                System.out.println("El producto " + producto.getNombre() + " no tiene stock suficiente.");
                return;
            }
        }

        // Cobrar el pedido
        double total = 0;
        for (Producto producto : pedido.getProductos()) {
            total += producto.getPrecio();
            // Reducir el stock
            producto.setStock(producto.getStock() - 1);
        }
        total += pedido.getEnvio().getCostoEnvio();



            if (pedido.getPago().getMonto() >= total) {
                pedido.setEstado("Pagado");
                System.out.println("Pedido pagado exitosamente.");
            } else {
                System.out.println("Fondos insuficientes para pagar el pedido.");
                return;
            }

            // Enviar el pedido
            System.out.println("Enviando el pedido a " + pedido.getEnvio().getDireccionEnvio());
            pedido.setEstado("Enviado");

            // Confirmar envío
            System.out.println("Pedido enviado exitosamente. Estado del pedido: " + pedido.getEstado());

    }
}
