import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Reading number of lines
        int n = sc.nextInt();
        
        // Step 2: Create an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        
        // Step 3: Reading each line
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();  // number of integers on this line
            ArrayList<Integer> line = new ArrayList<>();
            
            // Reading the integers for this line
            for (int j = 0; j < d; j++) {
                line.add(sc.nextInt());
            }
            
            // Add the current line to the list of ArrayLists
            arrList.add(line);
        }
        
        // Step 4: Reading number of queries
        int q = sc.nextInt();
        
        // Step 5: Process each query
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt() - 1;  // line index (0-based)
            int y = sc.nextInt() - 1;  // position index (0-based)
            
            // Ensure the x-th line exists and has enough elements
            if (x >= 0 && x < arrList.size()) {
                ArrayList<Integer> line = arrList.get(x);
                
                // Ensure y-th position is within bounds of this line
                if (y >= 0 && y < line.size()) {
                    // Output the result for the query
                    System.out.println(line.get(y));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();  // Close the scanner
    }
}
