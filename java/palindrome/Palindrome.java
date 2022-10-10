package palindrome;

import java.util.Optional;

import static java.util.Optional.ofNullable;

public class Palindrome {

    public static String isPalindromeText(String input) {
        return "%s%s a palindrome".formatted(input, isPalindrome(input) ? " is" : " isn't");
    }

    private static boolean isPalindrome(String input) {
        if (ofNullable(input).map(String::isEmpty).isEmpty()) {
            return false;
        }
        return new StringBuilder(input).reverse().toString().equalsIgnoreCase(input);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeText("Bob"));
        System.out.println(isPalindromeText("bob"));
        System.out.println(isPalindromeText("Steve"));
        System.out.println(isPalindromeText(null));
    }
}
