# proyecto
Proyecto Final de la materia Modelado y Programación, 2022-2.

Una vez concluído el curso de modelado y programación, se espera que el
alumno haya obtenido los conocimientos suficientes para poder aplicar distintas
estrategias, conocimientos y patrones de diseño la construcción de un programa
robusto y bien diseñado.

# Objetivo
Aplicar los conocimientos adquiridos durante el curso para poder realizar
programas que resuelvan necesidades ligadas a situaciones acercadas a la reali-
dad.

# Descripción del problema
El dueño de un restaurante de hamburguesas busca agilizar la operación de
su negocio a trav ́es de una caja registradora que organice las  ́ordenes del lugar
y conectarlo en tiempo real con su inventario vigente. Un sistema similar a las
cajas registradores que existen en restaurantes como McDonalds.

# Requerimientos
La tarea a realizar es dise ̃nar y programar un sistema de caja registradora
que permita cobrar a los comensales de acuerdo a su pedido, el programa debe
ser completamente funcional y robusto, es decir, que no falle por motivo alguno,
adem ́as que debe llevar congruencia con el inventario existente en el restaurante.
Puedes suponer que el due ̃no del restaurante te dio un paquete completo de
lo que conlleva el men ́u, es decir, cada platillo tiene una respectiva lista de
ingredientes necesarios con sus respectivas porciones y alg ́un precio relacionado.

1. El restaurante requiere poder cobrar cada uno de estos art ́ıculos en el
men ́u de forma autom ́atica, el programa debe mostrar el men ́u completo
del restaurante con la finalidad de poder darle las opciones al comensal
cuando ordena.

2. Toma en consideraci ́on las distintas variaciones en existencia, es decir,
si existe la posibilidad de realizar un platillo un combo y los distintos
tama ̃nos que el mismo puede tener, para ello piensa en el ajuste final que
tendr ́ıa el precio as ́ı como las porciones que se aumentan en los ingredientes
requeridos.

3. Por cada orden realizada se deben actualizar las existencias en el inventario
de ingredientes. En caso de que no sea posible realizar un platillo por falta
de ingredientes, se deber ́a descartar la visibilidad del art ́ıculo en el men ́u,
as ́ı como notificar al cajero en curso que dicho art ́ıculo en especial no
puede ser preparado.

4. Por cada orden realizada se deber ́a generar un ticket de compra con un id
 ́unico, este ID ser ́a el n ́umero de orden llevada a cabo, es decir, la primera
compra registrada en el sistema ser ́a la (#1). La serializaci ́on debe ser
congruente con el d ́ıa, por lo que es importante acompa ̃nar el registro con
la fecha actual en la que el pedido fue realizado.

El ticket además de la información relacionada al número de orden y
fecha realizada debe contener un desgloce del pedido realizado, es decir,
que art ́ıculos fueron pedidos con su respectivo precio, los ajustes de precio
realizados en caso de que hayan sido combos y otra clase de descuentos.
Al final debe estar el precio total por la orden, as ́ı como el monto pagado
y el cambio devuelto por la caja.

5. El  ́ultimo punto hace impl ́ıcito que el programa tambi ́en debe contar con
un proceso de cobro por cada orden realizada.

# Implementación
El dise ̃no e implementaci ́on, as ́ı como las tecnolog ́ıas utilizadas para el desa-
rrollo del proyecto quedan libres al criterio del equipo, como requisito estricto
se pide que el proyecto cuente con el uso de tres patrones de dise ̃no siendo
uno de ellos el Modelo-Vista-Controlador.

# Entrada y Salida
Dado que es estrictamente necesario el uso del modelo vista controlador,
las entradas y salidas del programa estar ́an proporcionadas por interfaz gr ́afica
amigable para el usuario.

# Evaluación 
Para la evaluaci ́on de su proyecto, se tomar ́a en cuenta lo siguiente:
1. Correcta implementaci ́on de los patrones de dise ̃no.
2. El programa tenga el funcionamiento deseado.
3. Correcto arrojamiento y manejo de excepciones.
4. El flujo del programa sea robusto, es decir, no pueda ser vulnerado por el
usuario.
5. El programa cuente con buenas pr ́acticas para el desarrollo de software.
6. Dise ̃no amigable con el usuario.
7. En caso de que el proyecto no pueda compilarse, se calificar ́a autom ́atica-
mente en 0.
Adem ́as, es necesario que se entregue un reporte sobre el dise ̃no, desarrollo e
implementaci ́on del proyecto, detallando las tecnolog ́ıas usadas, aplicaci ́on del
uso de los patrones de dise ̃no, dificultades encontradas durante el proceso y su
respectiva mitigaci ́on. Mientras m ́as detallado sea el reporte, se podr ́a evaluar
el proyecto de manera m ́as precisa y con criterio dirigido a la implementaci ́on,
en lugar de una interpretaci ́on abierta al evaluador.

# Puntos Extras
Se pueden ganar puntos extra si:
Se hacen uso de m ́as patrones de dise ̃no de los requeridos.
La interfaz gr ́afica rebasa las expectativas del cuerpo acad ́emico.
El proyecto tiene funcionalidades adicionales, un ejemplo es llevar es-
tad ́ısticas relacionadas a las ventas realizadas, alg ́un registro de los pla-
tillos m ́as vendidos, horarios en los que hay mayor flujo de pedidos, etc.
Las funciones adicionales pueden ser muchas, no hay porque limitarse al
ejemplo.

# Entrega
Se entregará un proyecto compilable y ejecutable que cumpla con las ca-
racter ́ısticas descritas anteriormente. Adicional al código, se debe entregar un
reporte e instrucciones de compilación y ejecución del programa. El proyecto se
entregará en la plataforma Google Classroom. La fecha de entrega es abierta
para todo el día, es decir, se tiene hasta las 23:59 hrs para que la entrega se
considere a tiempo. Por efectos de la evaluaci ́on, el proyecto no tiene permitido
una pr ́orroga, por lo que cualquier entrega extempor ́anea no podrá ser evaluada.
