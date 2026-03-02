/**
 * ===============================================================
 * MAIN CLASS – PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * @author Developer
 * @version 2.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check palindrome using if-else
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}