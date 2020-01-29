package composition;


public class Main {
    public static void main(String[] args) {
        Address workAddress = new Address("Armenia", "Yerevan", "Moskovyan", 15);
//        System.out.println(workAddress);

        Address homeAddress = new Address("Armenia", "Abovyan", "Garni 3", 62);
        Company company = new Company("AKNA", workAddress);
        Job job = new Job("QA engineer", company, 200000);


        Person person = new Person(24, "Armine", homeAddress, job);
        System.out.println(person);

    }
}
