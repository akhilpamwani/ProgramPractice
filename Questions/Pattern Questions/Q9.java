// Q:Print the 0-1 Half Pyramid Patern
/**
 * 1
 * 01
 * 101
 * 0101
 * 10101
 */
public class Q9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
             // Outer Loop
            for (int j = 1; j <= i; j++) {
                 // Inner Loop
                int s = i + j;
                if (s % 2 == 0) {
                    System.out.print("1");
                } else if (s % 2 != 0) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
