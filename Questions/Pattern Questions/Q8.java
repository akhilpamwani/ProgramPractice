// Q:Print the Fyoid Pyramid Patern
/** 1
 *  2 3
 *  4 5 6
 *  7 8 9 10 
 *  11 12 13 14 15
 * */
public class Q8 {
    public static void main(String[] args) {
        int n=5;
        int c=1;
        for (int i = 1; i <=n; i++) {
             // Outer Loop
            for (int j = 1; j <=i; j++) {
                 // Inner Loop
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
