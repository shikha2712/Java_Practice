package com.company.array;

import java.util.Scanner;

public class array_CWH_practice {
    public static void main(String[] args) {
      /*  float [] ar = {67.8f,34.8f,87.5f,79.7f,89.5f};
        float sum = 0;

        for(float e:ar)
        {
            sum = sum + e ;
        }
        System.out.println(sum);

        //----------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------------");

        int [] a = {87,98,76,79,96,45};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int flag = 0;

        for(int i =0 ; i<a.length;i++)
        {
            if(a[i]==n)
            {
               flag = 1;
            }

        }
        if (flag == 1)
        {
            System.out.println("Given no is present in array");
        }
        else
        {
            System.out.println("Given no is not present in array");
        }

        //----------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------------");

        int [][]mat1 = {{1,2,3},{4,5,6}};
        int [][]mat2 = {{7,8,9},{5,3,8}};
        int [][]result = {{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++)
            {
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result [i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++)
            {
                System.out.print(result[i][j] + " ");
                result [i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println("");
        }
        */

        int [] ar = {45,56,67,78,89,90};
        int l = ar.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for(int i=0;i<n;i++)
        {
            temp = ar[i];
            ar[i] = ar[l-1-i];
            ar[l-1-i] = temp;
        }

        for(int e:ar)
        {
            System.out.println(e);
        }


    }
}
