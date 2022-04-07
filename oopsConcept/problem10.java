package com.company.oopsConcept;

 class diffSquares{
        public int diff_Squares(int num){
                int sum_of_squares = 0;
                for(int i = 1; i<=num ; i++){
                         sum_of_squares += i*i;
                }
                int sum = 0;

                for(int i =1;i<=num;i++){
                        sum += i;
                }
                int square_of_sum = sum * sum;

                return (sum_of_squares - square_of_sum);
        }
}
public class problem10 {
        public static void main(String[] args) {
                diffSquares ds = new diffSquares();
                System.out.println(ds.diff_Squares(2));

        }
}
