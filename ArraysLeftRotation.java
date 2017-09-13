import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraysLeftRotation {
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
    public static void main(String[] args) {
        // ** GIVEN **
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // ** GIVEN **
        int newArr[] = new int[n];
        for (int newIndex = 0; newIndex < newArr.length; newIndex++) {
            int oldInd = (newIndex + k) % n;
            newArr[newIndex] = a[oldInd];
            System.out.print(newArr[newIndex] + " ");
        }
    }
}
