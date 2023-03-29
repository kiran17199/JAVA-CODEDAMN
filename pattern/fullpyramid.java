// import java.util.Scanner;

public class fullpyramid {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int rows = scanner.nextInt();
        int rows = 4;

    //    outer loop
    //    this line iterates the 'i'  it starts from 1 and goes up to rows
        for(int i = 1; i<=rows; i++) { 
             
            // inner loop
            // 
            for(int j = 1; j<=rows-i; j++) {

                // printing spaces
                System.out.print(" ");
            }

            // 
            for( int k = 1; k<=2*i-1; k++) {
                // printing stars
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
