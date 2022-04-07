package com.company.array;

import java.util.Scanner;
public class array_practice {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter A or D for Ascending and Descending :");
        char ch = sc.next().charAt(0);

        char ch1 ='A';
        char ch2='D';

        if(ch==ch1) {


            System.out.println("Enter Array Length : ");
            int n =sc.nextInt();

            int [] arr=new int[n];

            System.out.println("Enter Array Element one by one : ");

            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int temp;
            for(int i=0;i<n;i++) {
                for(int j=i+1;j<n;j++) {
                    if(arr[i]>arr[j]) {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.println("Ascending Array Is : ");
            for(int element: arr) {
                System.out.print(element+" ");
            }
        }


        if(ch==ch2) {

            System.out.println("Enter Array Length : ");
            int n =sc.nextInt();

            int [] arr=new int[n];

            System.out.println("Enter Array Element one by one : ");

            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int temp;
            for(int i=0;i<n;i++) {
                for(int j=i+1;j<n;j++) {
                    if(arr[i]<arr[j]) {      //1 2
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }

                }
            }
            System.out.println("Descending Array Is : ");
            for(int element: arr) {
                System.out.print(element+" ");
            }
        }

    }
}
