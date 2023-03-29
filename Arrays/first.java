package Arrays; 

import java.util.Arrays; //it imports the 'java.util.Arrays' package, it provides utility methods for working with arrays in java//

public class first {  /*it declares the public class named first which contains main() method */

 public static void main(String args[]) { //it defines main method which id the entry point of java program it takes an array of strings named 'args' as an input parameter//
   int[] arr = new int[5]; //this line decalres an integer array named 'arr' with a size of 5//

   arr[0] = 1; //these lines assign integer value to each element of the array 'arr' like 'arr[0]' is assigned  to 1, 'arr[1]- assigned to 2', 'arr[2]'- 3, 'arr[3]'-4, 'arr[4]'- 5//
   arr[1] = 2;
   arr[2] = 3;
   arr[3] = 4;
   arr[4] = 5;

   for (int i = 0; i < arr.length; i++) 
   //the loop iterates over each element of the array 'arr'. it starts with 'i' set to 0 nd contnues as long as 'i' is less than the length of the array which is 5
   //on each iteration it prints the value o the current element of 'arr' to the console using the println() method of System.out//
{
       System.out.println(arr[i]);
   }
 }
}
