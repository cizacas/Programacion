package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b;
		boolean resul;
		System.out.println("Introduce a: ");
		a=teclado.nextInt();
		System.out.println("Introduce b: ");
		b=teclado.nextInt();
		resul=a==b;
		System.out.println("El resultado es: "+resul);
	}

}
