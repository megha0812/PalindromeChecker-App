// version 1.0
//author megha kadiyala
//usecase 1: Welcome Page
//usecase2: Palindrome Check using String reverse
//usecase3: Character Array Based Palindrome Check
import java.util.Scanner;
public class UseCase4PalindromeChecker
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC4: Palindrome Check (Character Array Method) ===");
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }
        scanner.close();
    }
}
