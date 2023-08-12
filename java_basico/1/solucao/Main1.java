package solucao;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anos:");
        final int anos = scanner.nextInt();

        System.out.println("Meses:");
        final int meses = scanner.nextInt();

        System.out.println("Dias:");
        final int dias = scanner.nextInt();

        final int anosEmDias = anos * 365;

        final int mesesEmDias = meses * 30;

        final int resultado = anosEmDias + mesesEmDias + dias;

        System.out.println("Resultado: " + resultado);


    }
}