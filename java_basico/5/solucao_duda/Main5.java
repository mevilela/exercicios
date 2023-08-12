package solucao_duda;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
       //Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$788,00)

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do Salario Minimo");
        double salMin = sc.nextDouble();

        System.out.println("Valor do Salario Usuário");
        double salUser = sc.nextDouble();

        double qtdSal = salUser / salMin;
        System.out.printf("total = %.2f", qtdSal);

    }
}
