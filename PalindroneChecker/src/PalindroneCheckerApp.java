/**
 * ===============================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class validates a palindrome by normalizing
 * the string (removing spaces and ignoring case)
 * before performing the comparison.
 *
 * @author Developer
 * @version 10.0
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "A man a plan a canal Panama";

        // Normalize string: remove spaces & convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}