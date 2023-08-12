package Solucao_Duda;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Informar um saldo e imprimir o saldo com reajuste de 1%.

        Scanner sc = new Scanner(System.in);
        System.out.println("informe saldo: ");
        double saldo = sc.nextDouble();

        System.out.println(saldo + saldo * 0.01);


    }
}
