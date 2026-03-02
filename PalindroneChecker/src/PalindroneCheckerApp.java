/**
 * ===============================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Demonstrates dynamic selection of palindrome algorithms
 * using the Strategy Design Pattern.
 *
 * @author Developer
 * @version 12.0
 */

import java.util.*;

// ================= INTERFACE =================
interface PalindromeStrategy {
    boolean check(String input);
}

// ================= STACK STRATEGY =================
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// ================= DEQUE STRATEGY =================
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front & rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// ================= MAIN APP =================
public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // 🔥 Choose strategy dynamically
        PalindromeStrategy strategy;

        // You can switch algorithm here
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean isPalindrome = strategy.check(input);

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}