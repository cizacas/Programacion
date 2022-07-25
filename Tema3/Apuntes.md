# UNIDAD 3. ESTRUCTURAS DE CONTROL.

## INTRODUCCIÓN

Hasta ahora las instrucciones que hemos visto, son instrucciones que se ejecutan secuencialmente. Las instrucciones de control de flujo permiten alterar esta forma de ejecución. A partir de ahora habrá líneas en el código que se ejecutarán o no dependiendo de una condición.

Esa condición se construye utilizando lo que se conoce como expresión lógica. Una expresión lógica es cualquier tipo de expresión Java que dé un resultado booleano (verdadero o falso).
Las expresiones lógicas se construyen por medio de variables booleanas o bien a través de los operadores relacionales (==, >, <,…) y lógicos (&&,||, !).

## SENTENCIAS DE CONTROL DE FLUJO

### IF - Sentencia condicional simple

Se trata de una sentencia que, tras evaluar una expresión lógica, ejecuta una serie de instrucciones en caso de que la expresión lógica sea verdadera. Si la expresión tiene un resultado falso, no se ejecutará ninguna expresión. Su sintaxis es:

```
if(expresión lógica)
{
	instrucciones
	….
}

// Ejemplo:

if(nota>=5)
{
	System.out.println("Aprobado");
	aprobados++;
}
```

Las llaves se requieren sólo si va a haber varias instrucciones. En otro caso se puede crear el if sin llaves:
```
if(expresión lógica) sentencia;

// Ejemplo:

if(nota<5)
	System.out.println("Suspenso");
```
