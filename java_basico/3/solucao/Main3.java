package solucao;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo:");
        final float saldo = scanner.nextFloat();
        final float saldoReajustado = saldo * 1.01f;

        System.out.printf("Saldo reajustado: %.2f", saldoReajustado);

    }
}