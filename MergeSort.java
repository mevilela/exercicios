package sort;

public class MergeSort {
    /*
    If only one number
        Quit
    Else
        Sort left half of numbers
        Sort right half of numbers
        Merge them
     */

    public static void mergeSort(int[] numbers, int left, int right) {

        if (left < right) {
            int middle = (right + left) / 2;
            mergeSort(numbers, left, middle);
            mergeSort(numbers, middle + 1, right);

            // Mescla as partes ordenadas
            merge(numbers, left, middle, right);
        }
    }

    private static void merge(int[] numbers, int left, int middle, int right) {

        //dividir o array em dois

        int nRight = middle - left + 1;
        int nLeft = right - middle;

        int[] leftArray = new int[nRight];
        int[] rightArray = new int[nLeft];

        for (int i = 0; i < nRight; i++) {
            leftArray[i] = numbers[left + i];
        }
        for (int j = 0; j < nLeft; j++) {
            rightArray[j] = numbers[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < nRight && j < nLeft) {
            if (leftArray[i] <= rightArray[j]) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < nRight) {
            numbers[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < nLeft) {
            numbers[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 5, 4, 1, 6, 0, 3, 10};
        int n = numbers.length;

        mergeSort(numbers, 0, n - 1);

        // Imprimir a array ordenada
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


