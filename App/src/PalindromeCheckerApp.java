// version 11.0
//author megha kadiyala
//usecase 1: Welcome Page
//usecase 2: Check Hardcoded String for Palindrome
//usecase 3: Palindrome Check using String Reverse
//usecase 11: Object-Oriented Palindrome Service
import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {

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
}

public class OOPPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}