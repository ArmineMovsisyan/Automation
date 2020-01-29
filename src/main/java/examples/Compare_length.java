package examples;

public class Compare_length {
    public static void main(String[] args) {

        for (String element : compareLength()) {
            if (element == null){
                continue;
            }
            System.out.println(element);
        }


    }

    public static String[] compareLength() {
        String[] array = {"aaaas", "hhhhh", "ahhhh a", "kak", "aj", "u", "abcdefg", "1"};
        String[] newArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 3) {
                newArr[i] = array[i];
                continue;
            }

        }
        return newArr;
    }
}
