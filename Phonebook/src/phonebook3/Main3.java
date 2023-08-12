package phonebook3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //quando ele dá o exemplo do typedef - crio outra classe: Person

        Person p1 = new Person("Carter", "+1-617-495-1000");
        Person p2 = new Person("David", "+1-949-468-2750");

        String search = input.nextLine();

        if(p1.name.equals(search)){
            System.out.println(p1.getName() + " " + p1.getPhoneNumber());
        } else if(p2.name.equals(search)){
            System.out.println(p2.getName() + " " + p2.getPhoneNumber());
        } else {
            System.out.println("not found");
        }

        return;
    }
}
