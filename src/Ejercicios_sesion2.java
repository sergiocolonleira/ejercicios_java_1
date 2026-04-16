public class Ejercicios_sesion2 {

//DECLARO LAS VARIABLES DE LOS EJERCICIOS SIGUIENTES//

    //Ejercicio 1: Constantes y buenas prácticas.
    static final double IVA = 0.21;
    static int precioBaseProducto = 100;

    static double precioFinal = (precioBaseProducto * IVA) + (precioBaseProducto);

    //Ejercicio 2: Declarar una variable de cada tipo
    static boolean prueba = true;
    static int prueba2 = 3;
    static short prueba3 = 20000;
    static int prueba4 = 5;
    static long prueba5 = 10000000L;
    static float prueba6 = 2.34f;
    static double prueba7 = 7.45;
    static char prueba8 = 'A';

//Ejercicio 4: Diferencias entre enteros y decimales

    static int EJ4i = 10;
    static double EJ4D = 10;
    static float EJ4F = 10.0f;
    static int divisorEJ4 = 3;

    //Ejercicio 5: Casting explícito
    static double numero = 9.75;
    //Ejercicio 6: Promoción de tipos
    static byte A = 10;
    static byte B = 20;
    static int alternativaByte = 10;
    static int alternativaByteb = 20;
    static byte resultadoFinal = (byte) (A + B); //Caso específico para byte, preguntar porque me da un int si 30 también es byte.

//Ejercicio 7: Operadores relacionales y lógicos

    static int edad = 20;
    static boolean tieneCarnet = true;

//Ejercicio 8: Programa que evite división entre 0
    static int dividendo = 10;
    static int divisor = 0;

//Ejercicio 10: Referencias vs primitivos.
static int a = 10;
static int b = a;
static String s1 = "Hola";
static String s2 = s1;





    static void main() {
//Ejercicio 1: Constantes y buenas prácticas

        System.out.println(precioFinal);


//Ejercicios 2: Declara una variable de cada tipo y que se muestren en terminal
       //Hago un SOUT de cada una de las variables declaradas arriba y las llamo para que salgan por pantalla
        System.out.println(prueba);
        System.out.println(prueba2);
        System.out.println(prueba3);
        System.out.println(prueba4);
        System.out.println(prueba5);
        System.out.println(prueba5);
        System.out.println(prueba6);
        System.out.println(prueba7);
        System.out.println(prueba8);

//Ejercicios 3: Indica el tipo de literal y crea una variable adecuada para cada uno
        int valorInt = 10; //Int, primitivo
        double valorDouble = 10.0; //Double, primitivo
        long valorLong = 10L; // Long, primitivo
        float valorFloat = 10.0F; // Float, primitivo
        char valorChar = 'A'; // Char, primitivo
        String hola = "Hola"; //String, refere
        boolean valorBoolean = true; // Boolean o buleano, primitivo.

//Ejercicio 4: Diferencias entre enteros y decimales

        int Resultado_DIV_1 = (EJ4i / divisorEJ4);
        System.out.println(Resultado_DIV_1); //Resultado es 3, el parámetro es un int, por tanto no admite decimales
        double Resultado_DIV_2 = (EJ4D / divisorEJ4);
        System.out.println(Resultado_DIV_2); // Resultado es 3.3333333333333335, el parámetro es un double, utilizado para decimales, que redondea más tarde que un float.
        float Resultado_DIV_3 = (EJ4F / divisorEJ4);
        System.out.println(Resultado_DIV_3); // Resultado es un 3.3333333, el parámetro es un float, utilizado para decimales, que redondea más pronto que un double.
//El double es más exacto que un float, pero el float ocupa menos espacio y es más limpio.

//Ejercicio 5: Casting explícito

        int resultado = (int) numero; //Lo que quiero-nombre de lo que me va a salir = (lo que quiero) - nombre de la variable que va a cambiar de primitivo
        System.out.println(resultado); //sout (nombre de lo que me va a salir)
        byte resultado2 = (byte) numero;
        System.out.println(resultado2);
        //En ambos hay pérdida de información (la parte decimal) ya que ambos primitivos son usados para números enteros

//Ejercicio 6: Promoción de tipos.

/* byte resultadoByte = A + B;
        System.out.println(resultadoByte); Así va a dar error porque Java, en operaciones aritméticas, byte, short y char se promocionan automáticamente a int.
                Propuesta de solución: Cambiar int por byte ambos parámetros
                Propuesta de solución 2: Pedir en resultado, que me de un int en vez de un byte
                Propuesta de solución 3: Crear la variable resultadoFinal, en la que resultadoFinal es un byte "forzado" y que el sout ya me lo de como un byte */
        int resultadoAlternativo = alternativaByte + alternativaByteb; //propuesta 1
        System.out.println(resultadoAlternativo);

        int resultadoByte = A + B; //propuesta 2
        System.out.println(resultadoByte);

        System.out.println(resultadoFinal); //propuesta 3

//Ejercicio 7: Operadores relacionales y lógicos

        if (edad >= 18 && tieneCarnet) { //&& Indica que las dos deben de ser verdaderas, si no se cumplen las dos, no vale.
            System.out.println("Puedes conducir");
        } else {
            System.out.println("No puedes conducir");
        }

//Ejercicio 8: Evitar una división entre 0
 /* Escribe un programa que evite una división entre cero usando &&.
Debe comprobar primero que el divisor no sea cero antes de hacer n % d.*/

        if (divisor!= 0 && dividendo % divisor == 0) { //Si el divisor es distinto de 0 + si y solo si el dividendo y el divisor se pueden dividir y el resultado es exacto
            System.out.println("Se puede dividir");
        } else if (divisor == 0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            System.out.println(dividendo + " NO es divisible entre " + divisor);
        }
//Ejercicio 9: Alcance de variables
       // int x = 10;
      //  if (x == 10) {
       //     int y = 20;
       // }
       /* System.out.println(y); Genera error porque la variable "y" está localizada dentro de la función del if.
       En su lugar debería ir un else, else if, sout... Si ubicamos int "y" fuera de la función del if, pero dentro del main
       funcionaría. También funcionaría aplicando un else, como en el ejemplo inferior, ya que "y" estaba "ocupando" el lugar
       de else en la función. Se añade else, se "mueve" "y" a la línea inferior y se solucionaría el problema.
        */
        int x = 10; //Declaor el int
        if (x == 10) { //Abro el if, si x es = y solo = a 10, y se convierte en 20. Sout y que imprima por pantalla.
        int y = 20;
        System.out.println(y);
    }
// Ejercicio 10: Referencia vs primitivo
        b = 20;
        System.out.println(b);
        s2 = "Adios";
        System.out.println(s2);
/* Ninguno de los dos cambia, en el sout se imprime lo que se coloca aquí, no lo que está declarado arriba, que, tampoco se modifica
  después de haber variado los datos aquí abajo*/


}
}











