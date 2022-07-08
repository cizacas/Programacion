# UNIDAD 1.  ELEMENTOS DE UN PROGRAMA INFORMÁTICO

## INTRODUCCIÓN

¿Qué es un **programar**?

Programar es hacer programas. Obvio, ¿verdad? 

La siguiente pregunta sería entonces: ¿Que es un programa?

Un **programa** es una secuencia de instrucciones escritas para realizar una tarea específica con un ordenador.

Se plantea un problema, se idea una solución, se traduce a un lenguaje de programación y el ordenador lo ejecuta.

**Algoritmo** es un esquema para resolver cierto tipo de problema. Un algoritmo son los pasos que hay que dar para resolver un problema.
Un algoritmo se puede traducir en un programa para que el ordenador pueda entenderlo y ejecutarlo.

Un algoritmo está compuesto de:

* Entrada: datos del problema a resolver
* Salida: el resultado de la resolución
* Proceso: pasos a seguir para la resolución

Y un algoritmo se caracteriza porque ha de ser:

* Preciso: orden estricto + expresiones precisas 
* Definido: con la misma entrada, siempre resulta la misma salida
* Finito: número finito de pasos

Pasos para la resolución de un problema con ordenador:

* Diseño de un algoritmo
* Codificación de un programa
* Ejecución y validación

Será más fácil si lo vemos con un ejemplo:

Imagínate que el problema que se plantea es que tenemos que sumar dos números para averiguar el resultado. En primer lugar tenemos como datos de entrada los dos números concretos que queremos sumar, el proceso será realizar la suma de ambos números y la salida será mostrar el resultado de dicha suma.

Resumido en un esquema sería así:

- Problema: Sumar dos números
- Solución: 
    - Entrada: dos números
    - Salida: guardar la suma en la memoria y imprimirla por pantalla
    - Proceso: 
        - Pedir los dos números 
        - Calcular la suma y guardar el resultado en la memoria
        - Imprimir el resultado por pantalla

## LENGUAJE JAVA Y ENTORNO DE DESARROLLO

El lenguaje que vamos a utilizar es Java. Java es un lenguaje de programación que se desarrolló para satisfacer las nuevas necesidades que requería la creación de aplicaciones a principios de los 90. 


El lenguaje en sí mismo toma mucha de su sintaxis de C y C++, pero tiene un modelo de objetos más simple y elimina herramientas de bajo nivel, que suelen inducir a muchos errores.


Se buscaban principalmente dos cosas:

* Fácil de aprender:
    * Simple
    * Similitud de sintaxis con C y C++ pero más sencillo al eliminar características como punteros.
* Trabajar de forma eficiente
    * Orientado a objetos
    * Robusto y seguro
    * Arquitectura portable: gracias a la máquina virtual de Java
    * Multitarea

### Ejecución de programas en Java

![Descripción de la imagen](/img/esquema_java.jpg)

Para poder ejecutar un programa Java es necesario tener instalado en el equipo una máquina virtual Java. Se trata de un programa que traduce las instrucciones compiladas del programa Java al lenguaje máquina que corresponda, según la plataforma bajo la que se ejecute el programa. 

Sun proporciona de forma gratuita una máquina virtual Java con el nombre Java Runtime Environment (JRE) que puede descargarse desde la web de Java, buscando la versión correspondiente al sistema operativo sobre el que se desea ejecutar el programa.

Con Java se pueden desarrollar aplicaciones para diversos entornos de funcionamiento:

    Sin entorno gráfico, para el terminal.
    Con entorno gráfico de Windows, Linux o MacOS.
    Aplicaciones para páginas web.
    Aplicaciones para dispositivos móviles: Teléfonos, PDA, etc.
    Para sistemas de servidor.

Os dejo un enlace por si queréis consultar un poco de la historia de Java y consultar las versiones.

![Enlace a la wikipedia](https://es.wikipedia.org/wiki/Java_(lenguaje_de_programaci%C3%B3n))



Para que un programador pueda llevar a cabo su tarea, dispone de herramientas para llevar a cabo su tarea. Lo más básico es tener un editor de texto donde escribir las instrucciones y un compilador que transforme estas instrucciones en un fichero con la codificación adecuada para que el ordenador sea capaz de ejecutarlo.






