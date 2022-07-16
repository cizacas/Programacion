package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double adulto,infantil, total;
		System.out.println("Introduce cuantas entradas adulto: ");
		adulto=teclado.nextInt();
		System.out.println("Introduce cuantas entradas infantil: ");
		infantil=teclado.nextInt();
		total=adulto*20+infantil*15.50;
		total=total>=100?total*0.95:total;
		System.out.println("El total a pagar es: " + total);
		
	}

}
