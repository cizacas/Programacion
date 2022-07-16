package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double base,IVA, total;
		System.out.println("Introduce la base imponible: ");
		base=teclado.nextDouble();
		System.out.println("Introduce el IVA a aplicar: ");
		IVA=teclado.nextDouble();
		total=base+base*IVA/100;
		System.out.println("El total con IVA es: "+total);
	}

}
