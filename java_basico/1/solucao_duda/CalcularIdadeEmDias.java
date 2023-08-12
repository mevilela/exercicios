package solucao_duda;

import java.util.Scanner;

public class CalcularIdadeEmDias {

    public void execute(){
        Scanner input = new Scanner(System.in);

        System.out.println("anos: ");
        int anos = input.nextInt();
        System.out.println("meses: ");
        int meses = input.nextInt();
        System.out.println("dias ");
        int dias = input.nextInt();

        // anos = 365 dias , mes = 30 dias
        // 2 anos = 2* 365
        // 3 meses = 3*30
        // dia = valor input
        // dias = 2*365 + 3*30 + dias_input

        //anos * 365 + meses * 30 + dias

        int total = anos * 365 + meses * 30 + dias;
        System.out.println(total);

    }
}
