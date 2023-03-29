import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {

        // declaring the value of 'n'
        // int n = 4; 


        // taking input from user
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            
            // outer loop 
            //  a for loop with a loop variable i that starts at 1 and continues as long as i is less than or equal to n. This loop iterates over the rows of the half pyramid.
            for(int i=1; i<=n; i++) {


                // inner loop 
                //  another for loop with a loop variable j that starts at 1 and continues as long as j is less than or equal to i. This loop iterates over the columns of each row of the half pyramid.
                for(int j=1; j<=i; j++) {

                    // it prints a * character for each column of the current row.
                    System.out.print( j );
                }

                // it prints a newline character, which moves the cursor to the next line in the console. This is done after every row of the half pyramid is printed.
                System.out.println();
            }
        }
    }
}
