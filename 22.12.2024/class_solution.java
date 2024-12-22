import java.text.NumberFormat;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        // Input: Read the amount of money
        double money = 12324.134;

        // Format the amount in US, India, China, and France currency formats
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Print the formatted amounts for each country
        System.out.println("US: " + usFormat.format(money));
        System.out.println("India: " + indiaFormat.format(money));
        System.out.println("China: " + chinaFormat.format(money));
        System.out.println("France: " + franceFormat.format(money));
    }
}
