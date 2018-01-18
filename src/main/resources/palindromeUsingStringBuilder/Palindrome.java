package main.resources.palindromeUsingStringBuilder;

import java.util.Scanner;

/**
 * Created by Manish Dua on 1/18/2018.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string...");
        String input = scanner.nextLine();
        Boolean isPalindrome = isPalindrome(input);
        System.out.print(isPalindrome);
    }

    private static Boolean isPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(input);
    }
}
