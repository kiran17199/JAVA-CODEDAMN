import java.util.Scanner;
//java util is a package and scanner is a class of java.util package//

public class fromuser {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("what's your age?");
        int age = scanner.nextInt();

        System.out.println("your age is" + age);
    }
}
