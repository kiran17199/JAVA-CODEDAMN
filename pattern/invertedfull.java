import java.util.Scanner;

public class invertedfull {
    public static void main(String[] args) {

        // declaring value for row 
        // int row = 4;

        // taking input from user
        try (Scanner scanner = new Scanner(System.in)) {
            int row = scanner.nextInt();
      
            // this line iterates the i and it goes from rows to i 
            for(int i = row; i>=1; i--) {

                // 
                for(int j = 1; j<=row-i; j++) {
                    System.out.print(" ");
                }

                for(int k = 1; k<=2*i-1; k++){
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
    
}
