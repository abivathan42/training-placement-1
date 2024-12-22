mport java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the size of the list and the list itself
        int N = scanner.nextInt();  // Number of elements in the list
        List<Integer> L = new ArrayList<>();
        
        // Read the initial list of integers
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }

        // Read the number of queries
        int Q = scanner.nextInt();

        // Perform the queries
        for (int i = 0; i < Q; i++) {
            String query = scanner.next();  // Read query type
            if (query.equals("Insert")) {
                int x = scanner.nextInt();  // index
                int y = scanner.nextInt();  // value to insert
                L.add(x, y);  // Insert y at index x
            } else if (query.equals("Delete")) {
                int x = scanner.nextInt();  // index to delete
                L.remove(x);  // Remove element at index x
            }
        }

        // Print the modified list
        for (int num : L) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
