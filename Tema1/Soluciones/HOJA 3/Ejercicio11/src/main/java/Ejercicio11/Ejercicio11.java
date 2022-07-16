package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double m;
		int cm;
		
		System.out.println("Introduce metros con decimales: ");
		m=teclado.nextDouble();
		
		cm=(int)(m*100);
		
		System.out.println("La longitud en cm es: "+cm);
	}

}
