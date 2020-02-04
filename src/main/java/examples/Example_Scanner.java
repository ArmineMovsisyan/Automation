package examples;

import java.util.Scanner;

public class Example_Scanner {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your clear salary");

        int salary = Integer.parseInt(myObj.nextLine());
        System.out.print("Your registration salary is: " + registrationSalary(salary));

    }

    public static int registrationSalary(int salary) {
        salary += salary * 23 / 100 + salary * 2.5 / 100 + 1000;
        return salary;
    }
}