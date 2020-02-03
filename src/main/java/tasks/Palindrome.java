package tasks;

import java.util.Scanner;

/**
 * Created BY Armine Movsisyan on 03 February,2020
 */
public class Palindrome {

    public static void main(String[] args) {
        isPalindrome();
    }


     private static void isPalindrome() {
        String inputValue;
        Scanner in = new Scanner(System.in);

        System.out.println("Input a string");
        inputValue = in.nextLine();

        int length = inputValue.length() - 1;
        int index = 0;
        int i;


        for (i = 0; i <= length / 2; i++) {
            if (inputValue.charAt(index) == inputValue.charAt(length)) {
                index++;
                length--;
            } else
                break;
        }
        if (i == length / 2 + 1)
            System.out.println("Your input is a palindrome");
        else
            System.out.println("Not a palindrome");
    }
}



