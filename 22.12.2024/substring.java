import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the string input
        String inputString = scanner.nextLine();

        // Read the start and end indices
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Print the substring from start to end-1
        System.out.println(inputString.substring(start, end));

        // Close the scanner
        scanner.close();
    }
}
