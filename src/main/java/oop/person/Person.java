package oop.person;

/**
 * Created BY Armine Movsisyan on 09 February,2020
 */
public class Person {
    private String name;
    private String company;
    private int age;

    public Person(String name, String company, int age) {
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("name: %s , company: %s , age: %d", name, company, age);
    }
}
