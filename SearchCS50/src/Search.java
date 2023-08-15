import java.util.Scanner;

public class Search {
    public class Main {
        public static String main(String[] args) {

            Scanner input = new Scanner(System.in);

            int[] numbers = new int[]{20, 500, 10, 5, 100, 1, 50};

            int n = input.nextInt();

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] == n) {
                    System.out.println("found");
                }
            }

            System.out.println("not found");
            return null;

        }
    }

}
