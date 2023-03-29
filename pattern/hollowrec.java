import java.util.Scanner;

public class hollowrec {
	public static void main(String[] args) {

        // declaring values of 'n' and 'm'
		// int n = 4;
		// int m = 5;

        //taking input from user
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            //outer loop
            // This line starts a for loop with a loop variable i that starts at 1 and continues as long as i is less than or equal to n. This loop iterates over the rows of the rectangular pattern.
            for(int i = 1; i <= n; i++) {


                // inner loop
                // This line starts another for loop with a loop variable j that starts at 1 and continues as long as j is less than or equal to m. This loop iterates over the columns of the rectangular pattern.
                for(int j = 1; j <= m; j++) {


                    // cell -> (i,j)
                    // This block of code contains an if else statement that checks whether the current cell (i,j) is on the border of the rectangle. If it is, it prints a * character, otherwise it prints a space character.
                    if(i == 1 || j == 1 || i == n || j == m) {
                        System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
                }
                System.out.println();
                    
            }
        }
        
	}
}