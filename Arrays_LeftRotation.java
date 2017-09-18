import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arrays_LeftRotation {
    // Outline:
    // Take in an array and the number of left rotations and then
    // return the resulting array after the rotations have occurred.
    // Algorithm:
    // Calculate new index as being:
    // old index = (new index + number of left rotations) % size of array.
    // 10 5
    // 1 2 3 4 5 6 7 8 9 10
    // Then
    // old index = (1 + 5) % 10 = 6
    // OR
    // 10 12
    // 1 2 3 4 5 6 7 8 9 10
    // Then
    // old index = (1 + 12) % 10 = 3
    // Input
    // Integer, Integer, An array of Integers.
    // Output
    // An array of Integers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int newArr[] = new int[n];
        for (int newIndex = 0; newIndex < newArr.length; newIndex++) {
            int oldInd = (newIndex + k) % n;
            newArr[newIndex] = a[oldInd];
            System.out.print(newArr[newIndex] + " ");
        }
    }
}
