package solucao_duda;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
      //  Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero ");

        int numero = sc.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("antecessor = " + antecessor);
        System.out.println("sucessor = " + sucessor);



    }
}
