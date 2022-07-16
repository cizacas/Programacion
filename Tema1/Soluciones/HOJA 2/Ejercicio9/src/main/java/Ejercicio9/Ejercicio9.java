package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		double a,b,c;
		System.out.println("Introduce valor del primer cateto: ");
		a=teclado.nextDouble();
		System.out.println("Introduce valor del segundo cateto: ");
		b=teclado.nextDouble();
		c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("El valor de la hipotenusa es: "+c);
	}

}
