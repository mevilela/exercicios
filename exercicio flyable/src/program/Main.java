/*Write a Java program to create an interface Flyable with a method called fly_obj().
Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
Implement the fly_obj() method for each of the three classes.
 */



package program;

import entities.Airplane;
import entities.Helicopter;
import entities.Spacecraft;

public class Main {
    public static void main(String[] args) {

        Helicopter helicopter = new Helicopter();
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();

        helicopter.fly_obj();
        spacecraft.fly_obj();
        airplane.fly_obj();


    }
}
