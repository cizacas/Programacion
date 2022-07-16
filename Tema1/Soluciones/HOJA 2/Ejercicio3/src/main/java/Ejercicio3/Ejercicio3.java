package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el precio de la vivienda en pesetas: ");
		precio=teclado.nextDouble();
		precio=precio/166.386;
		System.out.println("El precio en euros es :"+precio);
		System.out.printf("El precio en euros es %.2f €",precio);
	}

}
