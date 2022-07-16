package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double a,b,c,x,y;
		System.out.println("Introduce un a: ");
		a=teclado.nextInt();
		System.out.println("Introduce otro b: ");
		b=teclado.nextInt();
		System.out.println("Introduce otro b: ");
		c=teclado.nextInt();
		System.out.println("Introduce otro x: ");
		x=teclado.nextInt();
		y= a*Math.pow(x, 2)+b*x+c;
		System.out.println("Calculamos y: "+y);
	}

}
