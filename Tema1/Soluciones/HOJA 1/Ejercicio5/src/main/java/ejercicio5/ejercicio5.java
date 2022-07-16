package ejercicio5;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
	        double x , y;

	        System.out.print( "Introducir primer numero: " );
	        x = teclado.nextDouble(); // pedimos el primer numero al usuario
	        System.out.print( "Introducir segundo numero: " );
	        y = teclado.nextDouble(); // pedimos el segundo numero al usuario

	        System.out.println("\tx = " + x + "\ty = " + y);

	        // operaciones aritmeticas
	        System.out.println("\tx + y = " + String.valueOf(x+y));
	        System.out.println("\tx - y = " + String.valueOf(x-y));
	        System.out.println("\tx * y = " + String.valueOf(x*y));
	        System.out.println("\tx / y = " + String.valueOf(x/y));

	        // operaciones algebraicas
	        System.out.println("\tx ^ 2 = " + String.valueOf(Math.pow(x, 2)));
	        System.out.println("\t\u221A x = " + String.valueOf(Math.sqrt(x)));

	}

}
