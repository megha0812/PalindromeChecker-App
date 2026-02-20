// version 3.0
//author megha kadiyala
//usecase 1: Welcome Page
//usecase 2: Check Hardcoded String for Palindrome
//usecase 3: Palindrome Check using String Reverse
import java.util.Scanner;
public class UseCase3PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== UC3: Palindrome Check (String Reverse Method) ===");
        System.out.print("Enter a word or sentence: ");
        String original = scanner.nextLine();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);   // String concatenation
        }
        if (original.equals(reversed)) {
            System.out.println("Result: \"" + original + "\" is a PALINDROME.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a palindrome.");
        }
        scanner.close();
    }
}
