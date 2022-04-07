package com.company.array;

import java.util.Scanner;

public class CodeWithHarryPractice {
    public static void main(String[] args) {

//        float [] arr = {2.3f,4.55f,67.66f,34.56f,56.45f};
//        float sum = 0.0f;
//        for(int i = 0;i<arr.length;i++){
//            sum += arr[i];
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        int n = sc.nextInt();
//        boolean isPresent = false;
//        for(int i =0 ; i<arr.length;i++){
//            if(arr[i] == n){
//                isPresent = true;
//                break;
//            }
//        }
//        if(isPresent){
//            System.out.println("This number is present in array");
//        }
//        else {
//            System.out.println(" Not present in array");
//        }

//        int [][] a1 = {{1,2,3},{4,5,6}};
//        int [][] a2 = {{7,8,9},{5,6,7}};
//        int [][] result = {{0,0,0},{0,0,0}};
//
//        for(int i = 0;i < a1.length;i++){
//            for(int j = 0; j< a1[i].length;j++){
//                result [i][j] = a1[i][j] + a2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int a[] = {1,2,3,4,5};
//        int l = a.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i = 0;i<n;i++){
//            temp = a[i];
//            a[i] = a[l-1-i];
//            a[l-1-i] = temp;
//        }
//
//        for(int i : a){
//            System.out.print(i +" ");
//        }

//        int a[] = {2,54,667,8,45,87,766,78,34,786,355};
//        int max = 0;
//        int min = Integer.MAX_VALUE;
//        for(int i : a){
//            if(i>max) max = i;
//        }
//        System.out.println("largest element is " + max);
//
//        for(int i : a){
//            if(i<min) min = i;
//        }
//        System.out.println("Smallest element is " + min);


        int arr[] = {1,5,8,33,85,66,77};
        boolean isSorted = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("not sorted");
        }



    }
}
