package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int seg,min,horas,total;
		System.out.println("Introduce los segundos a transformar: ");
		total=teclado.nextInt();
		seg=total;
		horas=seg/3600;
		seg=seg%3600;
		min=seg/60;
		seg=seg%60;
		System.out.println("Los segundos : "+total+" son: ");
		System.out.println("Horas: "+horas);
		System.out.println("Minutos: "+min);
		System.out.println("Segundos: "+seg);
	}

}
