package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float radio, altura, superficie, volumen;
		final float PI = 3.141592f;
		System.out.println("Introduce el radio:");
		radio=teclado.nextFloat();
		System.out.println("Introduce la altura: ");
		altura=teclado.nextFloat();
		superficie=2*PI*radio*altura;
		System.out.println("Superficie lateral, 2*PI*r*h: "+ superficie);
		volumen=PI*radio*radio*altura;
		System.out.println("Volumen, PI* r al cuadrado * h: "+volumen);
		
	}
}
