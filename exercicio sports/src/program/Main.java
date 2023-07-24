/*3. Write a Java program to create a base class Sports with a method called play().
Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play
a specific statement for each sport. */


package program;

import entities.Basketball;
import entities.Football;
import entities.Rugby;
import entities.Sports;

public class Main {
    public static void main(String[] args) {

        Basketball basket = new Basketball();
        Football football = new Football();
        Rugby rugby = new Rugby();
        Sports sports = new Sports();

        System.out.println(sports.play());

        System.out.println("Basketball " + basket.play());
        System.out.println("Football " + football.play());
        System.out.println("Rugby " + rugby.play());



    }
}
