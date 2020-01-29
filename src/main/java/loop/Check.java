package loop;

import static java.lang.Math.floor;

public class Check {
    public static void main(String[] args) {
        double a = 14.59;

        if (floor(a) == a) {
            System.out.println("a is an integer");
        } else {
            System.out.println("a is a double");
        }
    }
}
