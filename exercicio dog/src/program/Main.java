/*Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void.
Create a Dog class that implements Animal and overrides speak() to print "Dog is barking"
 */

package program;

import entities.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println(dog.bark());
    }


}
