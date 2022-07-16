package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short x = 7;
		int y = 5;
		float f1 = 13.5;// le falta la f para indicar que es float
		float f2 = 8f;
		System.out.println("El valor de x es ", x, " y el valor de y es ", y);
		//en lugar de comas, hay que poner + dentro del argumento del println
		System.out.println("El resultado de x + y es " + (x + y))
		//falta el punto y coma
		System.out.println("El resultado de x - y es " + (x - y));
		System.out.printf("\n%s%s\n","División entera:","x / y = ",(x/y));
		System.out.println("Resto de la división entera: x % y = " + (x % y));
		System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
		System.out.println("El resultado de f1 / f2 es " + (f1 / f2))
		//falta el punto y coma

	}

}
