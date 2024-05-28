import java.util.*;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {

        // 1- check equality values in two arrays
        String[] animals = {"dog", "cat"};
        String[] otherAnimals = {"dog", "cat"};
        System.out.println("1- check equality values in two arrays : " + Arrays.equals(animals, otherAnimals));

        // 2- merge an array into another, then sort
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        int m = 3;
        /*for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }*/
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.println("2- merge an array into another, then sort" + Arrays.toString(nums1));

        // 3- remove elements
        int[] nums3 = new int[]{3, 2, 2, 3};
        int val = 3;
        int index = 0;
        for (int i = 0; i < nums3.length; i++) {
            if (nums3[i] != val) {
                nums3[index] = nums3[i];
                index++;
            }
        }
        System.out.println("3- Remove by translating values= " + Arrays.toString(nums3));

        // 4- remove duplicate elements
        int[] nums4 = new int[]{-3, -1, 0, 0, 0, 3, 3};
        int k = 0;
        for (int i = 1; i < nums4.length; i++) {
            if (nums4[i] != nums4[i - 1]) {
                nums4[k] = nums4[i];
                k++;
            }
        }
        System.out.println("4- remove duplicate elements by translating values= " + Arrays.toString(nums4));

        // 5- remove duplicate elements 2
        int[] nums5 = new int[]{1, 1, 1, 2, 2, 3};

        System.out.println("nums5= " + Arrays.toString(nums5));

    }
}