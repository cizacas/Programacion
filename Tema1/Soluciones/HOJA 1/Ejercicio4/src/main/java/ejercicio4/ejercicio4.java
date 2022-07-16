package ejercicio4;

public class ejercicio4 {

	public enum mes {
        ENERO, FEBRERO, MARZO,
        ABRIL, MAYO, JUNIO,
        JULIO, AGOSTO,SEPTIEMBRE,
        OCTUBRE,NOVIEMBRE,DICIEMBRE
    }
    public static void main(String[] args) {

        mes m = mes.MARZO;
        System.out.println("El valor de la variable de tipo enumerado m es: " + m);

        String mesactual="AGOSTO";
        m = mes.valueOf(mesactual);
        System.out.println("El valor de la variable de tipo enumerado m es: " + m);
    }

}
