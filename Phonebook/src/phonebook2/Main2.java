package phonebook2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    public class Main1 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String name = input.nextLine();

            // Quando ele ensina Typedef - troquei o exemplo dele para Hashmap

            Map<String, String> person = new HashMap<>();

            person.put("Carter", "+1-617-495-1000");
            person.put("David", "+1-949-468-2750");

            for (int i = 0; i < person.size(); i++){
                if (person.containsKey(name)){
                    System.out.println("found " + person.get(name));
                    return;
                }
            }
            System.out.println("not found");
            return;
        }
    }
}
