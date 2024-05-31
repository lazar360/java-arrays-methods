import java.util.*;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {

        // 1- check equality values in two arrays
        String[] animals = {"dog", "cat"};
        String[] otherAnimals = {"dog", "cat"};
        System.out.println("1- check equality values in two arrays : ");
        System.out.println("animals= " + Arrays.toString(animals));
        System.out.println("otherAnimals= " + Arrays.toString(otherAnimals));
        System.out.println("result= " + Arrays.equals(animals, otherAnimals));

        // 2- merge an array into another, then sort
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        System.out.println("2- merge an array into another, then sort");
        System.out.println("nums1= " + Arrays.toString(nums1));
        System.out.println("nums2= " + Arrays.toString(nums2));
        int n = 3;
        int m = 3;
        /*for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }*/
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.println("result= " + Arrays.toString(nums1));

        // 3- remove elements
        int[] nums3 = new int[]{3, 2, 2, 3};
        int val = 3;
        System.out.println("3- Remove by translating values=");
        System.out.println("nums3=" + Arrays.toString(nums3));
        System.out.println("value to remove= " + val);

        int index = 0;
        for (int i = 0; i < nums3.length; i++) {
            if (nums3[i] != val) {
                nums3[index] = nums3[i];
                index++;
            }
        }
        System.out.println("result= " + Arrays.toString(nums3));

        // 4- remove duplicate elements
        int[] nums4 = new int[]{-3, -1, 0, 0, 0, 3, 3};
        System.out.println("4- Remove duplicate elements");
        System.out.println("nums4=" + Arrays.toString(nums4));
        int k1 = 0;
        for (int i = 1; i < nums4.length; i++) {
            if (nums4[i] != nums4[i - 1]) {
                nums4[k1] = nums4[i];
                k1++;
            }
        }
        System.out.println("result= " + Arrays.toString(nums4));

        // 5- remove duplicate elements over 2 elements
        int[] nums5 = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println("5- Remove more than 2 duplicate elements (does not work with unordered numbers)");
        System.out.println("nums5=" + Arrays.toString(nums5));
        int j = 1;
        for (int i = 1; i < nums5.length; i++) {
            if (j == 1 || nums5[i] != nums5[j - 2]) {
                nums5[j++] = nums5[i];
            }
        }
        System.out.println("result= " + Arrays.toString(nums5));

        // 6- check majority element
        int[] nums6 = {1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2};
        System.out.println("6- check majority element");
        System.out.println("nums6=" + Arrays.toString(nums6));
        Map<Integer, Integer> counterMap = new HashMap<>();
        int majorityElement = -1;
        if (nums6.length < 3) {
            majorityElement = nums6[0];
        } else {
            for (int value : nums6) {
                int counter = counterMap.get(value) == null ? 0 : counterMap.get(value);
                counterMap.put(value, ++counter);
            }
            majorityElement = Collections.max(counterMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        }
        System.out.println("result= " + majorityElement);

        // 7- Rotate Array
        int[] nums7 = {1,2,3,4,5,6,7};
        int k = 3; //  k = k % nums.length;
        System.out.println("7- Rotate Array");
        System.out.println("nums7= " + Arrays.toString(nums7));
        int[] numsTmp = new int[nums7.length];
        for (int i = 0; i < nums7.length; i++) {
            numsTmp[(i+k) % nums7.length] = nums7[i];

        }
        nums7 = numsTmp;
        System.out.println("result= " + Arrays.toString(nums7));

    }
}