package sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    /* For i from 0 to n-1
        Find smallest number between numbers[i] and numbers[n-1]
        Swap smallest number with numbers[i]
    */

    public static void main(String[] args) {


        int[] numbers = {7, 2, 5, 4, 1, 6, 0, 3};

        int n = numbers.length;

        for (int i = 0; i <= n-1; i++) {
            //encontrar o menor numero
            int smallest = i;
            // encontrar o menor numero do restante da array
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[smallest]) {
                    smallest = j;

                }

            }
            //trocar as posições

            int aux = numbers[smallest];
            numbers[smallest] = numbers[i];
            numbers[i] = aux;

        }

            // Imprimir a array ordenada
            for (int num : numbers) {
                System.out.print(num + " ");
            }

    }
}
