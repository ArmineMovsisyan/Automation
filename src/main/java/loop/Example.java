package loop;

public class Example {

    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265};
        int win = times[0];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < times.length; j++) {

                if (times[i] > win)
                    win = times[i];


            }


        }
        System.out.println(win);
        System.out.println();
    }
}

