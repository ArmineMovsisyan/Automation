package encapsulation;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String company;
    private String profession;

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setCompany(String company) {
        this.company = company;

    }

    public String getCompany() {
        return company;
    }

    public void setProfession(String profession) {
        this.profession = profession;

    }

    public String getProfession() {
        return profession;
    }

    public void setSalary(int salary) {
        this.salary = salary;

    }

    public double getSalary() {
        return salary = salary + salary * 25 / 100;
    }


}


