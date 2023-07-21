/*Write a Java program to create an interface Shape with the getArea() method
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.*/


package program;

import entities.*;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20.0, 4.3);
        Triangle triangle = new Triangle(3.3, 4.5);
        Circle circle = new Circle(6.5);

        System.out.println("Rectangle's Area = " + rectangle.getArea());
        System.out.println("Triangle's Area = " + triangle.getArea());
        System.out.println("Circle's Area = " + circle.getArea());

    }
}
