// version 2.0
//author megha kadiyala
//usecase 1: Welcome Page
//usecase 2: Check Hardcoded String for Palindrome
import java.util.Scanner;
public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
        scanner.close();
    }
}
