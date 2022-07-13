# CADENAS DE TEXTO EN JAVA.

## INTRODUCCIÓN

La clase String nos permitirá almacenar cadenas de caracteres.Realmente es una secuencia de 0 a n caracteres. Es dinámica, por lo tanto le podemos asignar diferentes valores (cadenas), con diferente tamaño. Esto se debe a la asignación dinámica que se hace en memoria.

### Creación

Aunque como ya dije anteriormente es una Clase, podemos tratarla como un dato primitivo inicialmente. Una vez asignado un valor este es inmodificable. Cada vez que yo asigno un nuevo valor (nueva cadena), realmente provoca una nueva instanciación interna pero es transparente para nosotros.

```
public class usoString{
  public static void main(String[] args){
    String modulo="programación";
    String ciclo= new String();
    ciclo="Desarrollo de Aplicaciones Multiplataforma";
  }
}
```

### Asignación de valores

Las cadenas de caractéres o Strings en Java, se representan con comillas dobles. Si queremos que la propia " sea un carácter en si, y no el final de la cadena, hay que anteponer la secuencia de escape \.

```
System.out.println("*****ASIGNACION DE VALORES*****");
String introduccion;
introduccion="Trataremos inicialmente los 'String' para el manejo de cadenas. Son muy \"IMPORTANTES\"");
```

### Extracción de un carácter individual

Cada uno de los caractéres que forman parte de la cadena, tiene asignado una posición. El primer carácter de la cadena ocupa la posición 0, el segundo carácter la posición 1, y así sucesivamente.

Con el metodo charAt(posición), podemos acceder al carácter que ocupa dicha posición.

```
public class usoString{
  public static void main(String[] args){
    String modulo="programación";
    String ciclo= new String();
    ciclo="Desarrollo de Aplicaciones Multiplataforma";
    
    char c=ciclo.charAt(0);
    System.out.println("El primer caracter de ciclo es: "+c);
    System.out.println("El quinto caracter de ciclo es: "+charAt(4));
  }
}
```

### Obtener la longitud de la cadena

Otra función interesante en el manejo de cadenas es la que nos proporciona la longitud de la cadena. Incluye también los espacios en blanco ocupados dentro de la cadena. Para ello hacemos uso del método length().

```
public class usoString{
  public static void main(String[] args){
    String modulo="programación";
    String ciclo= new String();
    ciclo="Desarrollo de Aplicaciones Multiplataforma";
    
    char c=ciclo.charAt(0);
    System.out.println("El primer caracter de ciclo es: "+c);
    System.out.println("El quinto caracter de ciclo es: "+charAt(4));
    
    System.out.println("*****Longitud de la cadena*****);
    System.out.println("La longitud de la cadena ciclo es: "+ciclo.length());
  }
}
```

### Descomposición de una cadena

Es un método que permite extraer una subcadena dada, indicando la posición inicial y finjal de los caracteres a extraer. El método es substring(posIni, posFin);

```
System.out.println("*****Extraccion de una subcadena*****");
System.out.println("Subcadena de la cadena ciclo entre las posiciones 3 y 6: "+ciclo.substring(3,6);
```
