package inheritance;

import java.util.Scanner;

/**
 * Createb BY Armine Movsisyan on Jan
 */
public class Employee {
    private String profession;
    private String company;
    private int birthYear;
    private int salary ;

     Employee(String profession, String company, int salary, int birthYear) {
        this.profession = profession;
        this.company = company;
        this.salary = salary;
        this.birthYear = birthYear;
    }


    public String getProfession() {
        return profession;
    }

    public String getCompany() {
        return company;
    }

     int getSalary() {
        return salary;
    }

     int getBirthYear() {
        return birthYear;
    }

      void netToGrossSalaryConverter(int salary, int bYear) {
        if (bYear > 1974) {
            salary += salary * 23 / 100 + salary * 2.5 / 100 + 1000;

        } else {
            salary += salary * 23 / 100 + 1000;
        }
        System.out.println("Gross salary is: " + salary);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%d", profession, company, salary, birthYear);
    }
}
