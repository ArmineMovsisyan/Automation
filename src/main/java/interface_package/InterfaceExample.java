package interface_package;

/**
 * Created BY Armine Movsisyan on 05 February,2020
 */
public interface InterfaceExample {
    default void checkInterface(){
        System.out.println("I'm a default method in the interface");

    }
    static  void checkingInterface(){
        System.out.println("I'm a static method in the interface");

    }
}
