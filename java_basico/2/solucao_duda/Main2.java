package solucao_duda;

public class Main2 {
    public static void main(String[] args) {
        //Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

        System.out.println("8, 9 e 7: ");
        double media1 = (8.0 + 9.0 + 6.0) / 3;

        System.out.println("media: " + media1);


        System.out.println("4, 5 e 6: ");
        double media2 = (4 + 5 + 6) / 3;

        System.out.println("media: " + media2);

        System.out.println("soma das medias = " + (media1 + media2));

        System.out.println("media das medias = " + ((media1 + media2) / 2));
    }
}
