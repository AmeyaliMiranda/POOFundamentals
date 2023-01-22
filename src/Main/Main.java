package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numeroMayor = 0;
        int numeroMenor = 0;


        System.out.print("Ingrese un primer número: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese un segundo número: ");
        numero2 = entrada.nextInt();

        System.out.print("Ingrese un tercer número: ");
        numero3 = entrada.nextInt();

        if (numero2 > numeroMayor)    {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor)    {
            numeroMayor = numero3;
        }
        System.out.print("El numero mayor es: " + numeroMayor);

        if (numero2 <  numeroMenor)    {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor)    {
            numeroMenor = numero3;
        }

        System.out.print("\n" + " El numero menor es: " + numeroMenor);


    }
}
