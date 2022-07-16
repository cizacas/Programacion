package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n,m, resto;
		System.out.println("Introduce un número: ");
		n=teclado.nextInt();
		System.out.println("Introduce otro número: ");
		m=teclado.nextInt();
		resto=n%m;
		resto=m-resto;
		System.out.println("Al "+n+" tengo que sumarle "+resto);
		System.out.println("Para que sea multiplo de "+m);
	}

}
