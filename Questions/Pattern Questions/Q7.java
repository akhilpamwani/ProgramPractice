// Q:Print the Half Inverted Pyramid Patern
/**
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */

public class Q7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
             // Outer Loop
            for (int j = 1; j <= n - i + 1; j++) {
                 // Outer Loop
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/**  Alternative method
 * for (int i = n; i >= 1; i--) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(j);
 * }
 * System.out.println();
 * }
 */
