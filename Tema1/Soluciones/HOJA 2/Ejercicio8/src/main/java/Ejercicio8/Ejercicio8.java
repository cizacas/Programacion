package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		double radio,longitud, area;
		final double PI=3.141592;
		System.out.println("Introduce el radio del circulo:");
		radio=teclado.nextDouble();
		longitud=2*PI*radio;
		area= PI*radio*radio;
		area=PI*Math.pow(radio,2);
		System.out.println("longitud: "+longitud+" area:"+area);
	}
}
