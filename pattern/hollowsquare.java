import java.util.Scanner;

public class hollowsquare {
    public static void main(String[] args){

        // // declaring the value of 'n = number of rows' 'm = number of columns' 
        // int n = 4; 
        // int m = 4;

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            for(int i = 1; i<=n; i++){

                for(int j = 1; j<=m; j++){

                    if(i == 1 || j == 1 || i == n || j == m){
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
