package Arrays; //This line declares that this file belongs to the Arrays package. A package is a way of organizing related Java classes and interfaces.//

import java.util.Scanner; //This line imports the Scanner class from the java.util package, which allows us to read user input from the console.//

public class second { //This line defines a public class named second//
    public static void main(String[] args) { //This line defines the main() method, which is the entry point of the Java program. It takes an array of strings named args as an input parameter//
        Scanner scanner = new Scanner(System.in); //This line creates a new Scanner object that reads input from the console//
        int[] arr; //This line declares an integer array named arr, but doesn't initialize it yet//
        int x;

        x = scanner.nextInt();
        arr = new int[x];

        //These lines read an integer value from the console using the nextInt() method of the Scanner object and stores it in the variable x. It then initializes the arr array with a size of x using the new keyword//

        for(int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
            //This loop iterates x times and reads an integer value from the console using the nextInt() method of the Scanner object on each iteration. It then stores the integer value in the current element of the arr array//
        }
        System.out.println(arr);
        // System.out.println(Arrays.toString(arr));
    }
    
}
