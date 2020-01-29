package loop;

public class DecimalToBinary {

    public static void main(String[] args) {
        int num = 16;

        for (int i = 0; i < 8; i++) {

            System.out.print(num % 2);

            num /= 2;

        }
    }


}
