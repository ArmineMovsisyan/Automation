package exam;


public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Monkey", true);
        Animal animal2 = new Animal("Owl", true);
        Animal animal3 = new Animal("Dog", false);
        Animal animal4 = new Animal("Tiger", true);
        Animal animal5 = new Animal("Lion", false);
        Animal animal6 = new Animal("Koala", true);
        Animal animal7 = new Animal("Monkey", true);
        Tree tree1 = new Tree();
        tree1.addAnimal(animal1);
        tree1.addAnimal(animal2);
        tree1.addAnimal(animal3);
        tree1.addAnimal(animal4);
        tree1.addAnimal(animal5);
        tree1.addAnimal(animal6);
        tree1.addAnimal(animal7);

        tree1.printer();

    }
}
