
package cs4java;

import java.util.Random;
import java.util.Scanner;
/*
This program is for copying array 1 values ​​to array 2
*/
public class CS4Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Array do you want ? :");
        int lenght = input.nextInt();
        int myArray[] = new int[lenght];
        int myArray2[] = new int[lenght];
        Random rand = new Random();
        for (int i = 0; i <myArray.length; i++) {
            myArray[i] = rand.nextInt(999+i);
        }
        System.out.println("First Array Values :");
        for(int Array:myArray){
            System.out.print(Array+" ");
        }
        System.arraycopy(myArray, 0, myArray2, 0, myArray.length);
        System.out.println("\nSecond Array Values :");
        for(int Array:myArray2){
            System.out.print(Array+" ");
        }
    }
}
