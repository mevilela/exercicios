package solucao_duda;

import java.util.Scanner;

public class Main4 {

    /*
        Escrever um algoritmo que lê:
        a porcentagem do IPI a ser acrescido no valor das peças
        o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.

        Fórmula : (valor1quant1 + valor2quant2)*(IPI/100 + 1)
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("% do IPI ");

        double porcentoIpi = sc.nextDouble();

        System.out.println("Codigo da Peça 1 ");

        double codP1 = sc.nextDouble();

        System.out.println("Valor da Peça 1 ");

        double valP1 = sc.nextDouble();

        System.out.println("Quantidades peça 1");

        double qntP1 = sc.nextDouble();

        System.out.println("Codigo da Peça 2 ");

        double codP2 = sc.nextDouble();

        System.out.println("Valor da Peça 2 ");

        double valP2 = sc.nextDouble();

        System.out.println("Quantidades peça 2");

        double qntP2 = sc.nextDouble();


      //  Fórmula : (valor1quant1 + valor2quant2)*(IPI/100 + 1)

        double ipi = (porcentoIpi/100)+1;
        double total = (valP1*qntP1 + valP2*qntP2) * ipi;

        System.out.printf("total = %.2f", total);



    }



}
