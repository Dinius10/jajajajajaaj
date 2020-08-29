import java.util.Scanner;

/**
 * Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que se
 * llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los
 * elementos introducidos).
 */
public class Ejercicio4 {

    int[] vector,a;
    int i=0;
    int vector1;

    Scanner scanner;


    public Ejercicio4(){
        vector= new int[10];

        scanner = new Scanner(System.in);
    }
    public void ejecutar(){

        do{

                System.out.println("INGRESE VECTOR/" + i + "/: ");
                 vector1 = scanner.nextInt();

                vector[i] = vector1;
                i++;


        }while((i<10) && (vector1>=0));

        for (int i = 0; i < vector.length; i++) {
            int numero = vector[i];

            System.out.println("vector[" + i + "]: " + numero);
        }



    }

}
