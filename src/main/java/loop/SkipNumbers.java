package loop;

public class SkipNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i > 15 && i < 25) || (i > 45 && i < 55) || (i > 75 && i < 85)) {
                continue;

            }
            System.out.println(i);
        }
    }
}
