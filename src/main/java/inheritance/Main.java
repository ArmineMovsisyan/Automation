package inheritance;

import java.util.Scanner;

/**
 * Created BY Armine Movsisyan on Jan
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("please type net salary for the developer: ");
        Developer developer = new Developer("Java developer", "AKNA LLC", scanner.nextInt(), 1998);

        System.out.print("please type net salary for the automation QA: ");
        QA_engineer qa_engineer = new QA_engineer("Automation QA engineer", "Webb Fontaine", scanner.nextInt(), 1993);

        System.out.print("please type net salary for the HR: ");
        HR hr = new HR("HR manager", "Service Titan", scanner.nextInt(), 1987);

        printEmployee(developer);
        printEmployee(qa_engineer);
        printEmployee(hr);
    }

    private static void printEmployee(Employee employee) {
        System.out.println("Employee: " + employee);
        employee.netToGrossSalaryConverter(employee.getSalary(), employee.getBirthYear());

    }

    private Main() {
    }
}
