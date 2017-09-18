import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Strings_MakingAnagrams {
    // Outline
    // Compare two strings and return how many deletions would be required to make them anagrams of each other.
    // IE abc and cab is however aab and abc are not.
    // To make aab and abc anagrams you would get rid of an 'a' from the first.
    // Then a 'c' from the second.
    // Making them ab and ab.
    // Algorithm
    // 1. Loop through and count the occurrences of each letter in the string, IE abbc = 1 2 1 0 0 0....
    // 2. Sum the difference between the counts of each occuring letter between string, IE a = 2, a = 1, diff = 1.
    // 3. Return the total number of differences to know how many deletions need to occur.
    // Input
    // String, String.
    // Output
    // Integer.
    public static int numberNeeded(String first, String second) {
        int[] firstAlpha = new int[26];
        int[] secondAlpha = new int[26];
        countLetters(first, firstAlpha);
        countLetters(second, secondAlpha);
        return calcDiff(firstAlpha, secondAlpha);
    }

    static int calcDiff(int[] first, int[] second) {
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(first[i] - second[i]);
        }
        return result;
    }

    static void countLetters(String str, int[] alphabet) {
        for (Character c : str.toCharArray()) {
            switch (c) {
                case 'a':
                    alphabet[0]++;
                    break;
                case 'b':
                    alphabet[1]++;
                    break;
                case 'c':
                    alphabet[2]++;
                    break;
                case 'd':
                    alphabet[3]++;
                    break;
                case 'e':
                    alphabet[4]++;
                    break;
                case 'f':
                    alphabet[5]++;
                    break;
                case 'g':
                    alphabet[6]++;
                    break;
                case 'h':
                    alphabet[7]++;
                    break;
                case 'i':
                    alphabet[8]++;
                    break;
                case 'j':
                    alphabet[9]++;
                    break;
                case 'k':
                    alphabet[10]++;
                    break;
                case 'l':
                    alphabet[11]++;
                    break;
                case 'm':
                    alphabet[12]++;
                    break;
                case 'n':
                    alphabet[13]++;
                    break;
                case 'o':
                    alphabet[14]++;
                    break;
                case 'p':
                    alphabet[15]++;
                    break;
                case 'q':
                    alphabet[16]++;
                    break;
                case 'r':
                    alphabet[17]++;
                    break;
                case 's':
                    alphabet[18]++;
                    break;
                case 't':
                    alphabet[19]++;
                    break;
                case 'u':
                    alphabet[20]++;
                    break;
                case 'v':
                    alphabet[21]++;
                    break;
                case 'w':
                    alphabet[22]++;
                    break;
                case 'x':
                    alphabet[23]++;
                    break;
                case 'y':
                    alphabet[24]++;
                    break;
                case 'z':
                    alphabet[25]++;
                    break;
                default:
                    System.out.println("NO LETTER MATCH");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
