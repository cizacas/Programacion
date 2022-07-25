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
## EJERCICIOS

[Hoja de ejercicios 1](Ejercicios/Hoja01_Estructuras_01.pdf)

### SWITCH

Se la llama estructura condicional compleja porque permite evaluar varios valores a la vez. En realidad sirve como sustituta de algunas expresiones de tipo if-else-if. 
Su sintaxis es la siguiente:
 ```
 switch (expresiónEntera) 
{
	case valor1:
		instrucciones del valor 1
	break;
	case valor2:
		instrucciones del valor 2
	break;
		…
	default:
	/*instrucciones que se ejecutan si la expresión no toma
	ninguno de los valores anteriores*/
	
}
```
Esta instrucción evalúa una expresión (que debe ser short, int, byte o char), y según el valor de la misma ejecuta instrucciones. Cada case contiene un valor de la expresión; si efectivamente la expresión equivale a ese valor, se ejecutan las instrucciones de ese case y de los siguientes.

La instrucción **break** se utiliza para salir del switch. De tal modo que si queremos que para un determinado valor se ejecuten las instrucciones de un apartado case y sólo las de ese apartado, entonces habrá que finalizar ese case con un break.

El bloque default sirve para ejecutar instrucciones para los casos en los que la expresión no se ajuste a ningún case. Vemos un ejemplo:

```
switch (diasemana) 
{ 
     case 1:
           texto=”Lunes”; 
     break; 
     case 2:
           texto=”Martes”; 
     break; 
     case 3:
           texto=”Miércoles”; 
     break; 
     case 4:
           texto=”Jueves”; 
     break; 
     case 5:
        texto=”Viernes”; 
    break; 
    case 6:
       texto=”Sábado”; 
    break; 
    case 7:
        texto=”Domingo”; 
    break; 
    default: 
         texto=”?”; 
} 
```
```
switch (diasemana) 
{
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        laborable=true; break;
    case 6:
    case 7:
        laborable=false;
}
```
## EJERCICIOS

[Hoja de ejercicios 1](Ejercicios/Hoja01_Estructuras_02.pdf)






