import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the string input
        String A = scanner.nextLine();

        // Check if the string is a palindrome
        if (A.equals(new StringBuilder(A).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Close the scanner
        scanner.close();
    }
}
