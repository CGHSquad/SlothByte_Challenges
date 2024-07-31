import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortLetter {
    public static String[] sortLetters(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                int p1 = 0, p2 = 0;
                while(p1 < arr[i].length() && p2 < arr[j].length()) {
                    while (p1 < arr[i].length() && !Character.isLetter(arr[i].charAt(p1))) {
                        p1++;
                    }
                    // Skip non-letter characters in arr[j]
                    while (p2 < arr[j].length() && !Character.isLetter(arr[j].charAt(p2))) {
                        p2++;
                    }
                    if (p1 < arr[i].length() && p2 < arr[j].length()) {
                        char c1 = arr[i].charAt(p1);
                        char c2 = arr[j].charAt(p2);
                        if (c1 > c2) {
                            // Swap the strings
                            String temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break; // Break out of the while loop once swapped
                        } else if (c1 < c2) {
                            break; // No need to swap, break out of the while loop
                        }
                        p1++;
                        p2++;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortLetters(new String[]{"932c", "832u32", "2344b"})));
        System.out.println(Arrays.toString(sortLetters(new String[]{"99a", "78b", "c2345", "11d"})));
        System.out.println(Arrays.toString(sortLetters(new String[]{"572z", "5y5", "304q2"})));
    }
}
