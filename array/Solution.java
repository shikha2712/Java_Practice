package com.company.array;

class Solution1 {
    public int pivotIndex(int[] nums) {
        int left_sum = 0;
        int right_sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {


            for (int j = 0; j < i - 1; j++) {
                left_sum += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                right_sum += nums[j];
            }
            count += 1;
        }
        if (left_sum == right_sum) {
            return nums[count];
        }
        else  {
            return -1;
        }

    }
}

public class Solution{
    public static void main(String[] args) {

    }
}