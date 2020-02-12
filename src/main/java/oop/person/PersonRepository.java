package oop.person;

/**
 * Created BY Armine Movsisyan on 09 February,2020
 */
 class PersonRepository {
    static private String[] companies = {"AKNA", "WEbb Fontaine", "EGS", "ZERO", "Amazon", "Google"};
    static private String[] names = {"Armine", "Hmayak", "Vladislav", "Ani", "Arsen"};

    static Person[] getData() {
        Person[] persons = new Person[10];
        for (int i = 0; i < 10; i++) {
            Person person = new Person(names[(int) (Math.random() * names.length)], companies[(int) (Math.random() * companies.length)], (int) (Math.random() * 100));
            persons[i] = person;
        }


        return persons;

    }

}
