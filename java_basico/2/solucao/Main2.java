package solucao;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        final float media1 = (8 + 9 + 7) / 3f;
        final float media2 = (4+5+6) / 3f;
        final float somaMedias = media1 + media2;
        final float mediaMedias = (media1 + media2) / 2f;

        System.out.println("Media 1: " + media1);
        System.out.println("Media 2: " + media2);
        System.out.println("Soma medias: " + somaMedias);
        System.out.println("Media medias: " + mediaMedias);

    }
}