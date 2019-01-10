package BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{4,2,5,1,7})));
    }

     /**
 * Sorts unsorted array using BubbleSort algorithm. Time complexity O(n^2)
 *
 * @param a represents array with unsorted values 
 */
    private static int[] bubbleSort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
}
