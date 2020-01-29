package arrays;

public class Edge2 {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1;
                if (j == 0 || j == array.length - 1) {
                    array[i][j] = 2;

                }
                if (i == 0 || i == array.length - 1) {
                    array[i][j] = 2;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }

}

