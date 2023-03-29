import java.util.Scanner;
public class main {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println( a / b );
        }

    }
    
}
