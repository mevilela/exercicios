package sort;

public class BubbleSort {
    public static void main(String[] args) {
        /* Repeat N times
            For i from 0 to n-2
                If numbers[i] and numbers[i+1] out of order
                    Swap them
            If no swaps
                Quit*/

        int[] numbers = {7, 2, 5, 4, 1, 6, 0, 3};

        int n = numbers.length;

        for (int i = 0; i < n; i++){
            boolean swap = false;
            for (int j = 0; j < n - 1; j++){
                if(numbers[j] > numbers[j+1]){
                    int aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                    swap = true;
                }

            }
            if (!swap){
                break;
            }

        }

        // Imprimir a array ordenada
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
