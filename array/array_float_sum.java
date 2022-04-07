package com.company.array;

public class array_float_sum {
    public static void main(String[] args) {
        float [] arr = {34.5f,34.8f,86.6f,87.5f,79.3f};
        float sum = 0;
 /*       for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of given array:"+sum);

  */
        for(float element:arr){
            sum = sum +element;
        }
        System.out.println("sum of given array:"+sum);
    }
}
