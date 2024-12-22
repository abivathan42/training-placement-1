import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left by nextInt()

        // Loop through each pattern to check validity
        for (int i = 0; i < n; i++) {
            String pattern = scanner.nextLine();

            try {
                // Try to compile the given pattern
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // If the pattern is invalid, catch the exception and print "Invalid"
                System.out.println("Invalid");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
