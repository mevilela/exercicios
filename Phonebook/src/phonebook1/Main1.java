package phonebook1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();


        // Exemplo 1 aula CS50

        String[] names = {"Carter", "David"};

        String[] numbers = {"+1-617-495-1000", "+1-949-468-2750"};


        for (int i = 0; i <= names.length - 1; i++){
            if (names[i].equals(name)){
                System.out.println("found " + numbers[i]);
                return;
            }
        }
        System.out.println("not found");
        return;
    }
}
