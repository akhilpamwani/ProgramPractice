// Print the Inverted Half Pyramid
/**
 *  ######
 *  #####
 *  ###
 *  ##
 *  #
 */
/**
 * Q4
 */
public class Q4 {

    public static void main(String[] args) {
        int n = 5;
          // Outer Loop
        for (int i = n; i>=1; i--) {
             // Inner Loop 
            for (int j = 0; j <=i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}