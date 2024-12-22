import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Number of queries
        int t = sc.nextInt();
        
        // Process each query
        for (int i = 0; i < t; i++) {
            // Read the values for a, b, n
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += b * (1 << j); // 1 << j is equivalent to 2^j
                System.out.print(sum + " ");
            }
            System.out.println();  // Move to the next line after printing the series for each query
        }
        
        sc.close();
    }
}
