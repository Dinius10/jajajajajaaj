import java.util.Scanner;

/**
 * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas
 * entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha
 * sacado y la menor.
 */

public class ProMaMiV {  //PROMEDIO,MAXIMO,MINIMO = ProMaMiV

    int[] notas;

    Scanner scanner;


    public ProMaMiV(){
        notas= new int[5];

        scanner = new Scanner(System.in);
    }

    public void ejecutar(){

        for (int i = 0; i < notas.length; i++) {
            System.out.println("NOTAS/" + i + "/: ");
            int nota = scanner.nextInt();

            notas[i] = nota;
        }

        double suma =0;
        double promedio;
        int minimo = 10;
        int maximo = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("NOTAS/" + i + "/: " + notas[i]);

            suma = suma + notas[i];

            if(notas[i] < minimo){
                minimo = notas[i];
            }

            if(notas[i] > maximo){
                maximo = notas[i];
            }
        }

        promedio = suma / notas.length;

        System.out.println("PROMEDIO TOTAL DE NOTAS: " + promedio);
        System.out.println("MAXIMA NOTA: " + maximo);
        System.out.println("MINIMA NOTA: " + minimo);
    }
}
