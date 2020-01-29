package loop;

public class SkipDividers {


    public static void main(String[] args) {
        for (int x = 0; x <= 100; x++) {

            if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0) {
                continue;
            }
            System.out.println(x);


        }

    }
}


