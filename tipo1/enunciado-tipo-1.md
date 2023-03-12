# PSP. UT1. Examen de Procesos. Tipo 1

El alumno deberá:

1. Crear un proyecto con IntelliJ IDEA **llamado** `tipo1`
2. Utilizar **para todas sus clases el paquete**  `com.apellidoalumno.nombrealumno.psp`. Por ejemplo para el alumno Juan
   Agüí, el paquete debe ser `com.agui.juan.psp`
3. Implementar dos clases en Java, llamadas `Parent` y `Child`.
4. Ignorar las excepciones, añadiéndolas a la firma de los métodos.

La funcionalidad de estas clases se describe a continuación:

1. La clase `Parent` creará **tres** subprocesos `java` que ejecuten **concurrentemente y sin bloquearse** el código de
   la clase `Child`. Cada uno de ellos
   recibe **una** de estas cadenas como entrada al comienzo del subproceso.

> Sed eu cursus sem, id vehicula odio.

> Mauris sagittis non elit sed bibendum.

> Fusce finibus sollicitudin vestibulum.

2. Cada uno de los subprocesos hijos **darán la vuelta** a la cadena que han recibido y la **devolverán por su salida
   estándar** antes de finalizar su ejecución.

Para dar la vuelta a una cadena puedes utilizar la clase `StringBuilder` 
```java
StringBuilder stringBuilder = new StringBuilder(string);
stringBuilder.reverse();
```

3. El proceso padre **esperará** a la terminación de cada uno de los subprocesos y **recibirá las cadenas** a través de
   unos `Streams` conectados a cada uno ellos, y la escribirá por la pantalla.
4. El proceso padre escribirá el **código de salida** de cada subproceso.
5. El proceso padre **limpiará** todos los recursos que haya utilizado antes de finalizar su ejecución. 

La salida esperada por la consola es la siguiente
```
.oido alucihev di ,mes susruc ue deS
.mudnebib des tile non sittigas siruaM
.mulubitsev niduticillos subinif ecsuF
El proceso 1 terminó con estado 0
El proceso 2 terminó con estado 0
El proceso 3 terminó con estado 0
```