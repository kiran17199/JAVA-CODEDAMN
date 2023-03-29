import java.util.*;

public class factorial {

  public static void main(String args[]) {
    try (// Write your code here...
    Scanner scanner = new Scanner(System.in)) {
      int result = 1;
      int num = scanner.nextInt();

      for(int i = num; i >= 1; i--) {
          result = result * i;
      }

      System.out.println(result);
    }
  }
}