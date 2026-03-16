// version 5.0
//author megha kadiyala
//usecase 1: Welcome Page
//usecase 2: Check Hardcoded String for Palindrome
//usecase 3: Palindrome Check using String Reverse
//usecase 5:  Stack-Based Palindrome Checker
import java.util.Stack;

public class UC5StackPalindrome {

    public static void main(String[] args) {

        String word = "madam";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
