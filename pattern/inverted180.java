import java.util.Scanner;

public class inverted180
{
	public static void main(String[] args) {

        // declaring the value of 'n'
		// int n = 4;

        // taking input from user
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
    //	outer loop 
   //   line starts the outer for loop, which will be used to iterate over each row of the inverted triangle. The loop variable i starts at 1 and continues as long as i is less than or equal to n.
      for(int i=1; i<=n; i++) {


            //   inner loop -> space print
            // it starts the inner for loop, which is used to print spaces before the asterisks. This loop starts at 1 and continues as long as j is less than or equal to n-i. Since i increases with each row, the number of spaces printed on each line decreases. 
            for(int j=1; j<=n-i; j++) {

                // This line prints a space character.
                System.out.print(" ");
            }
            
            // inner loop -> star print 
            // This line starts another inner for loop, which is used to print asterisks. This loop starts at 1 and continues as long as j is less than or equal to i. Since i increases with each row, the number of star printed on each line increases
            for(int j=1; j<=i; j++) {

                // This line prints an star character
                System.out.print("*");
      }
      
   //    this prints a newline character, which moves the cursor to the next line in the console. This is done after every row of the inverted triangle is printed
      System.out.println();
}
        }
}
}