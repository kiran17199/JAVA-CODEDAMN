import java.util.Scanner;

public class inverted{
    public static void main(String[] args) {
        

        // declaring value for variable 'n = rows, cols'
        // int n = 4;

        // taking input fro  user
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
            // outer loop 
            //  a for loop with a loop variable i that starts at n and continues as long as i is greater than or equal to 1. This loop iterates over the rows of the inverted pyramid.
            for(int i = n; i>=1; i--) {
                
                // inner loop 
                //  another for loop with a loop variable j that starts at 1 and continues as long as j is less than or equal to i. This loop iterates over the columns of each row of the inverted pyramid.
                for(int j = 1; j<=i; j++){

                    // itprints a * character for each column of the current row.
                    System.out.print("*");
                }
                // this prints a newline character, which moves the cursor to the next line in the console. This is done after every row of the inverted pyramid is printed.
                System.out.println();
            }
        }
    }
}