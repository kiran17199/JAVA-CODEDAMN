import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {
        // This line declares the main method, which is the entry point for the program when it is executed. 
        // The "public" keyword means that the method is accessible from outside the class, and the "static" keyword means that it can be called without creating an instance of the class. 
        // The "void" keyword indicates that the method does not return a value. The parameter "String[] args" is an array of strings that can be passed as arguments to the main method.

        // declaring values for 'a' and 'b'
        //  int a = 4;
        //  int b = 5;


        //  taking input from user
         try (Scanner scanner = new Scanner(System.in)) {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
  
          // outer loop
          // it is a "for" loop that will iterate "a" number of times, with the loop variable "i" starting at 1 and incrementing by 1 each time through the loop.
          for (int i=1; i<=a; i++) {

            //it is another "for" loop inside the outer loop. This inner loop will iterate "b" number of times, with the loop variable "j" starting at 1 and incrementing by 1 each time through the loop. 
            // inner loop
            for (int j=1; j<=b; j++) {
              System.out.print("*");
            }
            System.out.println();
          }
        }
      }
    }