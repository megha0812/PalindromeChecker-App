// version 10.0
//author megha kadiyala
//usecase 1: Welcome Page
//usecase 2: Check Hardcoded String for Palindrome
//usecase 3: Palindrome Check using String Reverse
//usecase 10: Case-Insensitive & Space-Ignored Palindrome
import java.util.Scanner;
public class IgnoreCaseSpacePalindrome {
    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");

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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}