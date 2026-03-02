/**
 * ===============================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 * It compares characters from start and end positions
 * until the base condition is reached.
 *
 * @author Developer
 * @version 9.0
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "madam";

        // Call recursive method
        boolean isPalindrome = isPalindrome(input, 0, input.length() - 1);

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }

    /**
     * Recursive palindrome check
     */
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: pointers crossed or equal
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }
}