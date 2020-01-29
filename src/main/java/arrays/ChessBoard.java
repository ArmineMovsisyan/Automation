package arrays;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i % 2) == (j % 2)) {
                    array[i][j] = " * ";
                } else {
                    array[i][j] = " o ";
                }
                System.out.print(array[i][j]);

            }
            System.out.println();

        }
    }
}

