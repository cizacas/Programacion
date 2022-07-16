package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num, resto;
		System.out.println("Introduce un número: ");
		num=teclado.nextInt();
		resto=num%7;
		resto=7-resto;
		System.out.println("Al "+num+" tengo que sumarle "+resto);
		
	}

}
