package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int mm,cm,m;
		System.out.println("Introduce milímetros: ");
		mm=teclado.nextInt();
		System.out.println("Introduce centímetros: ");
		cm=teclado.nextInt();
		System.out.println("Introduce metros: ");
		m=teclado.nextInt();
		cm=cm+mm/10+m*100;
		System.out.println("El total de centímetros es: "+cm);
	}

}
