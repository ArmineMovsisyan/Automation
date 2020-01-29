
package encapsulation;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee();
        employees[0].setFirstName("James ");
        employees[0].setLastName("Bach");
        employees[0].setSalary(2560);
        employees[0].setCompany("Scholar");
        employees[0].setProfession("Consulting Software Tester and Buccaneer");

        employees[1] = new Employee();
        employees[1].setFirstName("Henrik");
        employees[1].setLastName("Emilsson");
        employees[1].setSalary(3000);
        employees[1].setCompany("Nordic Medtest");
        employees[1].setProfession("Human strategist");

        employees[2] = new Employee();
        employees[2].setFirstName("Joe");
        employees[2].setLastName("Colantonio");
        employees[2].setSalary(1500);
        employees[2].setCompany("TestGuild");
        employees[2].setProfession("Founder");

        employees[3] = new Employee();
        employees[3].setFirstName("Michael");
        employees[3].setLastName("Bolton");
        employees[3].setSalary(1760);
        employees[3].setCompany("DevelopSense");
        employees[3].setProfession("Software Testing consultant");

        employees[4] = new Employee();
        employees[4].setFirstName("Cem");
        employees[4].setLastName("Kaner");
        employees[4].setSalary(3690);
        employees[4].setCompany("Florida Institute of Technology");
        employees[4].setProfession("Professor of Software Engineering");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Firstname: " + employees[i].getFirstName() + "\n" + "Lastname: " + employees[i].getLastName() + "\n" + "Salary: " + employees[i].getSalary() + "\n" + "Company: " + employees[i].getCompany() + "\n" + "Profession: " + employees[i].getProfession());
            System.out.println();
        }


    }

}
