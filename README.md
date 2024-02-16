# Calculadora Servidor-Cliente

### Descripción

Esta calculadora tiene commo funcionalidad, realizar operaciones básicas como:

* Suma
* Resta
* Multiplicación
* División

Con el principal objetio de realizar una conexión entre un servidor y un cliente, para que el cliente pueda realizar las operaciones mencionadas anteriormente.

### Metodología

Para la realización de este proyecto, se utilizó el lenguaje de programación Java. Se crearon dos clases, una para el servidor y otra para el cliente (en maquinas virtuales distintas, con direcciones IP's estaticas y red interna). El servidor se encarga de recibir las peticiones del cliente y realizar las operaciones, mientras que el cliente se encarga de enviar las peticiones al servidor.

Cabe destacar, que la clase servidor se ejecuta en un hilo, para que pueda recibir las peticiones de varios clientes al mismo tiempo.

1. **Servidor a Cliente**: 
  Inicialmente, se pregunta el tipo de operando aritmético que desea utilizar el cliente, de manera que este puede conocer el tipo de operación a realizar a continuación.

2. **Cliente a Servidor**: 
  El cliente envía los dos operandos a utilizar en la operación aritmética. Además de el primer y segundo valor numérico (contando decimales).

3. **Servidor a Cliente**: 
  El servidor envía el resultado de la operación aritmética al cliente.

4. **Cliente a Servidor**:
    El cliente una vez recibido el resultado, tiene la opción de decidir si quiere seguir operando con dicho resultado, o bien hacer una nueva operación.

>[!NOTE]
> En todo momento, el servidor se encuentra a la espera de nuevas peticiones por parte del cliente. Además de controlar posibles errores que el cliente pueda ocasionar al manejar la aplicación.

### Imagenes de la aplicación

Al iniciar el servidor y ambos clientes, se muestra la siguiente pantalla:

![img1.png](Media%2Fimg1.png)

La aplicación trabaja de manera independiente por cada cliente:
![img2.png](Media%2Fimg2.png)

![img3.png](Media%2Fimg3.png)

Al finalizar de operar con un cliente, se muestra el siguiente mensaje (sin afectar al otro cliente, y sólo cierra el socket del cliente que ha decidido finalizar):

![img4.png](Media%2Fimg4.png)

### Conclusiones

El desarrollo de esta aplicación, permitió entender el funcionamiento de los sockets en Java, y como se pueden utilizar para realizar una conexión entre un servidor y un cliente. Además de entender el funcionamiento de los hilos en Java, y como se pueden utilizar para realizar múltiples conexiones al mismo tiempo.