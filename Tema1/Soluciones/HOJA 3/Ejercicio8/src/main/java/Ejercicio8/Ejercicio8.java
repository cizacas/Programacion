package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int hormi,aran,cochi,patas;
		System.out.println("Introduce hormigas: ");
		hormi=teclado.nextInt();
		System.out.println("Introduce arañas: ");
		aran=teclado.nextInt();
		System.out.println("Introduce cochinillas: ");
		cochi=teclado.nextInt();
		patas=hormi*6+aran*8+cochi*14;
		System.out.println("El total de patas es: "+patas);
	}

}
