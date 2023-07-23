/*Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer.
In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
 */

package program;

import entities.Employee;
import entities.Manager;
import entities.Programmer;

public class Main {
    public static void main(String[] args) {

        Employee program1 = new Programmer("Will", 12, 160, 80);
        Employee manager1 = new Manager("John", 18, 160, 120);

        System.out.println("Programmer Salary: ");
        System.out.println(program1.getName() + " - " + program1.calculateSalary());
        System.out.println();
        System.out.println("Manager Salary: ");
        System.out.println(manager1.getName() + " - " + manager1.calculateSalary());

    }
}


