package ejercicio2;

public class ejercicio2 {

	public enum sexo {V,M};

    // clase principal que inicia la aplicacion
    public static void main(String[] args) {
       	boolean casado =true;
		final int MAXIMO = 999999;
		byte diasem = 1;
		short diaanual = 300;

        // segundos desde el 01/01/1970 hasta el 22/02/2001
        long miliseg = 1298332800000L;
        float totalfactura = 10350.678000f;
        long poblacion = 6775235741L;
        sexo s = sexo.M;

        // usando orden println
        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -------");
        System.out.println("\tEl valor de la variable casado es " + casado);
        System.out.println("\tEl valor de la variable MAXIMO es " + MAXIMO);
        System.out.println("\tEl valor de la variable diasem es " + diasem);
        System.out.println("\tEl valor de la variable diaanual es " + diaanual);
        System.out.println("\tEl valor de la variable miliseg es " + miliseg);
        System.out.println("\tEl valor de la variable totalfactura es " + totalfactura);
        System.out.println("\tEl valor de la variable poblacion es " + poblacion);
        System.out.println("\tEl valor de la variable sexo es " + s);


        // usando orden print
        System.out.print("\n\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -------\n");
        System.out.print("\tEl valor de la variable casado es " + casado + "\n");
        System.out.print("\tEl valor de la variable MAXIMO es " + MAXIMO + "\n");
        System.out.print("\tEl valor de la variable diasem es " + diasem + "\n");
        System.out.print("\tEl valor de la variable diaanual es " + diaanual + "\n");
        System.out.print("\tEl valor de la variable miliseg es " + miliseg + "\n");
        System.out.print("\tEl valor de la variable totalfactura es " + totalfactura + "\n");
        System.out.print("\tEl valor de la variable poblacion es " + poblacion + "\n");
        System.out.print("\tEl valor de la variable sexo es " + s +"\n");

        // usando orden printf
        System.out.printf("\n\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -------\n");
        System.out.printf("\tEl valor de la variable casado es %b\n", casado);
        System.out.printf("\tEl valor de la variable MAXIMO es %d\n", MAXIMO);
        System.out.printf("\tEl valor de la variable diasem es %bd\n", diasem);
        System.out.printf("\tEl valor de la variable diaanual es %d\n", diaanual);
        System.out.printf("\tEl valor de la variable miliseg es %d\n", miliseg);
        System.out.printf("\tEl valor de la variable totalfactura es %f\n", totalfactura);
        System.out.printf("\tEl valor de la variable totalfactura en notacion cientifica es %E\n", totalfactura);
        System.out.printf("\tEl valor de la variable poblacion es %d\n", poblacion);
        System.out.printf("\tEl valor de la variable sexo es %s\n", s);

	}

}
