package arrays;

public class YLetter {
    public static void main(String[] args) {
        String[][] array = new String[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == array.length - 1 - i || j == i) {
                    array[i][j] = " Y ";
                } else {
                    array[i][j] = " o ";
                }

                if (j >= array.length / 2 && i >= array.length / 2) {
                    array[i][j] = " o ";
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

