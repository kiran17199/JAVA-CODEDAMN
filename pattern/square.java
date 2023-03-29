import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        
        // declaring value for row and col
        // int row = 4, col = 4;


        // taking input from user
        try (Scanner scanner = new Scanner(System.in)) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();


            for(int i = 1; i<=row; i++){
                
                for(int j = 1; j<=col; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
}
