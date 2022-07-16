package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double b,h, area;
		System.out.println("Introduce base: ");
		b=teclado.nextDouble();
		System.out.println("Introduce altura: ");
		h=teclado.nextDouble();
		area=b*h/2;
		System.out.println("El area del triangulo es "+ area);
	}

}
