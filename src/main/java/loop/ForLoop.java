package loop;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 24; i++) {

            if (i % 3 == 0) {
                continue;
            }
            for (int j = 0; j <= 59; j++) {
                if (j >= 25) {
                    break;
                }

                for (int k = 0; k <= 59; k++) {

                    if (i == j && j == k) {
                        continue;
                    }
                    System.out.println(i + ":" + j + ":" + k);
                }
            }

        }
    }

}
