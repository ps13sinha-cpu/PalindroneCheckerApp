/**
 * ===============================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This program compares execution time of different
 * palindrome checking algorithms using System.nanoTime().
 *
 * @author Developer
 * @version 13.0
 */

import java.util.*;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("Input: \"" + input + "\"\n");

        // ===== Method 1: Two-pointer =====
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(normalized);
        long end1 = System.nanoTime();

        // ===== Method 2: Stack =====
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(normalized);
        long end2 = System.nanoTime();

        // ===== Method 3: Deque =====
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(normalized);
        long end3 = System.nanoTime();

        // ===== Display Results =====
        System.out.println("=== Performance Comparison ===");
        System.out.println("Two-Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result      : " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Result      : " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }

    // ================= TWO POINTER =================
    public static boolean twoPointerCheck(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // ================= STACK =================
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    // ================= DEQUE =================
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1)
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;

        return true;
    }
}