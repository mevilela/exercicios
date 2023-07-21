/* Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
 */


package program;

import entities.Bird;
import entities.Cat;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();

        System.out.print("cat's sound = ");
        cat.sound();
        System.out.print("bird's sound = ");
        bird.sound();

    }



}
