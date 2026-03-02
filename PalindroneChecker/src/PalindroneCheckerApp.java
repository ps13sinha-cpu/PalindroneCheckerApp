/**
 * ===============================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This program encapsulates palindrome validation logic
 * inside a dedicated service class following OOP principles.
 *
 * @author Developer
 * @version 11.0
 */

// Service class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Main application class
public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        // Call encapsulated method
        boolean isPalindrome = checker.checkPalindrome(input);

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}