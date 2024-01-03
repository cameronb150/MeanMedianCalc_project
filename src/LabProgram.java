import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int nums[];
        int count;

        // Step 0: Input array values
        count = scnr.nextInt();
        nums = new int[count];
        for (int i = 0; i < count; ++i) {
            nums[i] = scnr.nextInt();
        }

        int maxInt = nums[0];
        int minInt = nums[0];
        // Step 1: Find and output minimum and maximum values
        /* Type your code here */
        for (int i : nums) {
            if (i < minInt) {
                minInt = i;
            }
            if (i > maxInt) {
                maxInt = i;
            }
        }
        System.out.println("Minimum: " + minInt);
        System.out.println("Maximum: " + maxInt);


        // Step 2: Calculate and output mean
        /* Type your code here */
        double sum = 0.0;
        double mean;
        for (int i = 0; i < nums.length; ++i) {
            sum = sum + nums[i];

        }
        mean = sum / nums.length;
        System.out.printf("Mean: %.1f\n", mean);

        // Step 3: Check if palindrome
        /* Type your code here */
        boolean palindrome = true;

        for (int index = 0; index < nums.length; ++index) {
            if (nums[index] != nums[(nums.length - 1) - index]) {
                palindrome = false;
                break;
            }
        }
        System.out.println("Palindrome: " + palindrome);

        // Sort array elements in ascending order
        Arrays.sort(nums);
        double median = 0.0;

        // Step 4: Find and output median Otherwise, the median is the average of the middle two values. Output the median with one decimal place.
        /* Type your code here */
        if (nums.length % 2 == 0) {
            median = (nums[nums.length / 2] + nums[(nums.length / 2) - 1]) / 2.0;


        } else {
            median = nums[nums.length / 2];


        }
        System.out.printf("Median: %.1f\n", median);

        // Step 5: Find and output mode
        /* Type your code here */
        int mode = nums[0];
        int largest = 0;
     /* int count2;
      int count3;*/

        for (int test : nums) {
            int count2 = 0;

            for (int value : nums) {
                if (test == value) {
                    count2++;
                }


            }
            if (count2 > largest) {
                largest = count2;
                mode = test;
            }


        }
        System.out.println("Mode: " + mode);

    }
}
