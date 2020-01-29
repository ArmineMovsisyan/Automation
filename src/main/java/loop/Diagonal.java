package loop;

public class Diagonal {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == array.length - i) {
                    array[i][j] = " 0 ";
                } else {
                    array[i][j] = " y ";
                }
                System.out.print(array[i][j]);
            }

            System.out.println();
        }

    }
}