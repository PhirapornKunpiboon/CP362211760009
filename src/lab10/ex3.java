package lab10;

import java.util.Scanner;

public class ex3 {

    public static final  int Max =5;

    public static void main(String[] args) {

        //input data to array
        Scanner sc = new Scanner(System.in);
        int num[]= new int[Max];
         for (int i = 0; i < num.length; i++) {
             System.out.print("enter an integer : ");
             num [i] =sc.nextInt();
         }
         //find total value in array
        findAverang (num);


    }//main

    private static void findAverang(int[] num) {
        int total = 0 ;
        for (int val:num){
            total += val;

        }
        System.out.println("Total value: "+ total);
        System.out.println("Averang value : "+(total/num.length));
    }

}
