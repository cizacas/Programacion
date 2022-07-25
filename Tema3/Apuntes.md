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

### IF - Sentencia condicional compuesta

Es igual que la anterior, sólo que se añade un apartado else que contiene instrucciones que se ejecutarán si la expresión evaluada por el if es falsa. Sintaxis:

```
if(expresión lógica)
{
	instrucciones
	….
}
else 
{
	instrucciones
	…
}

```

Como en el caso anterior, las llaves son necesarias sólo si se ejecuta más de una sentencia. Ejemplo de sentencia if-else:

```
if(nota>=5)
{
	System.out.println("Aprobado");
	aprobados++;
}
else 
{
	System.out.println("Suspenso");
	suspensos++;
}
```


### IF - Anidación

Dentro de una sentencia if se puede colocar otra sentencia if. A esto se le llama anidación y permite crear programas donde se valoren expresiones complejas. La nueva sentencia puede ir tanto en la parte if como en la parte else.

Las anidaciones se utilizan muchísimo al programar. Sólo hay que tener en cuenta que siempre se debe cerrar primero el último if que se abrió. Es muy importante también tabular el código correctamente para que las anidaciones sean legibles.

El código podría ser:

```
if (x==1) 
{
         Instrucciones
         …
}
else 
{
         if(x==2) 
         {
                 instrucciones
                …
          }
          else 
          {
                  if(x==3) 
                  {
                           instrucciones
                           …
                   }
           }
}
```

Una forma más legible de escribir ese mismo código sería con la instrucción if-else-if:

```
if (x==1) 
{
      instrucciones
      …
}
else if (x==2) 
{
       instrucciones
       …
}
else if (x==3) 
{
        instrucciones
        …
}
```
