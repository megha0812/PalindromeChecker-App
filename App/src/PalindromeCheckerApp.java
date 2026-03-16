// version 13.0
//author megha kadiyala
//usecase 1: Welcome Page
//usecase 2: Check Hardcoded String for Palindrome
//usecase 3: Palindrome Check using String Reverse
//usecase 13: Performance Comparison of Algorithms
import java.util.*;
public class PalindromePerformance {
    public static boolean simpleCheck(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
    public static boolean stackCheck(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        long start1 = System.nanoTime();
        simpleCheck(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        stackCheck(input);
        long end2 = System.nanoTime();

        System.out.println("Simple Method Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Time: " + (end2 - start2) + " ns");
    }
}
