Este proyecto consiste en desarrollar un sistema de gestión de pedidos utilizando Java. El sistema permitirá gestionar clientes, productos, envíos, pagos y pedidos. Además, el sistema integrará funcionalidades para realizar solicitudes HTTP a una API externa, enviar datos en formato JSON y manejar las respuestas de dicha API. El proyecto utilizará bibliotecas externas como Gson para la manipulación de JSON y OkHttp para las solicitudes HTTP.

Requisitos del Sistema:
Gestión de Clientes:

Crear y almacenar información de clientes.
La información del cliente incluye nombre, dirección, teléfono y correo electrónico.
Gestión de Productos:

Crear y almacenar información de productos.
La información del producto incluye nombre, precio y stock.
Gestión de Envíos:

Crear y almacenar información de envíos.
Tipos de envíos: Envío Express, con costo y dirección de envío.
Gestión de Pagos:

Crear y almacenar información de pagos.
Tipos de pagos: Pago con tarjeta de crédito, con monto a pagar.
Gestión de Pedidos:

Crear y procesar pedidos.
Un pedido incluye un cliente, una lista de productos, un envío, un pago y un estado del pedido (pendiente, pagado, enviado).
Procesamiento de Pedidos:

Validar el stock de los productos antes de procesar un pedido.
Reducir el stock de los productos una vez que el pedido es procesado.
Calcular el total del pedido incluyendo el costo de envío.
Verificar si el pago es suficiente para cubrir el total del pedido.
Actualizar el estado del pedido (pendiente, pagado, enviado).
Integración con API Externa:

Enviar información a una API externa en formato JSON utilizando OkHttp.
Manejar las respuestas de la API y mostrar mensajes relevantes en la consola.
Funcionalidades Específicas:
Crear Clientes y Productos:

Cliente de ejemplo: Juan Pérez.
Productos de ejemplo: Laptop y Smartphone.
Crear un Pedido:

Un pedido que incluye los productos seleccionados, el cliente, el envío y el pago.
Enviar detalles de uno de los productos a una API externa.
Procesar el Pedido:

Validar que los productos tienen suficiente stock.
Calcular el total del pedido y validar el pago.
Actualizar el estado del pedido y mostrar mensajes de confirmación en la consola.
Solicitudes HTTP:

Realizar una solicitud POST a una API externa con detalles del producto en formato JSON.
Manejar las respuestas de la API y mostrar el resultado en la consola.
Tecnología y Bibliotecas Utilizadas:
Java: Lenguaje principal del proyecto.
Gson: Para la manipulación de JSON.
OkHttp: Para realizar solicitudes HTTP.
IDE: Se recomienda el uso de IntelliJ IDEA o Visual Studio Code.
Estructura del Código:
El código del proyecto incluye las siguientes clases:

Main: Clase principal que inicializa y ejecuta el sistema.
Cliente: Clase para representar a los clientes.
Producto: Interfaz para los productos.
ProductoConcreto: Clase concreta que implementa la interfaz Producto.
Envio: Interfaz para los envíos.
EnvioExpress: Clase concreta que implementa la interfaz Envio.
Pago: Interfaz para los pagos.
PagoTarjetaCredito: Clase concreta que implementa la interfaz Pago.
Pedido: Clase para gestionar los pedidos.
MyRequestBody: Clase para estructurar el cuerpo de la solicitud HTTP en formato JSON.
Este proyecto proporciona una base sólida para entender la gestión de pedidos y la integración con APIs externas en Java, proporcionando una experiencia práctica con el uso de bibliotecas populares para la manipulación de datos y la comunicación en red.






