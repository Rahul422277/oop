import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of City Strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        String s[] = new String[n];
        System.out.println("\nEnter the City names:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }

        System.out.println("\nThe cities before sorting are:");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        // Bubble sort
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    String tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }

        System.out.println("\nThe cities after sorting are:");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
