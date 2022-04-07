package com.company.array;

public class anonymus_array {
    public static void main(String[] args) {

        anonymus_array.sum(new int[]{10,20,30});
    }
    static void sum(int[]no){
        int total = 0;
        for(int e:no){
            total = total + e ;
        }
        System.out.println(total);
    }
}
