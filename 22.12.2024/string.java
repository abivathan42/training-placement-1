import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read input strings A and B
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // Sum the lengths of A and B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        // Compare lexicographically if A is greater than B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize the first letter of A and B and print them
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        // Close the scanner object
        scanner.close();
    }
}
