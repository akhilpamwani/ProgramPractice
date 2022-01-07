// Q3: Print the half Pyramid Pattern
/** 
 * #
 * ##
 * ###
 * ####
 * #####
 * "*/

public class O3 {
    public static void main(String[] args) {
        int n=6;
          // Outer Loop
        for (int i = 0; i <=n; i++) {
             // Inner Loop 
            for(int j=1;j<i;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
