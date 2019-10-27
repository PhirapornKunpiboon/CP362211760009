package lab7;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalEven =0;
        int totaOdd =0;
        int x =0;
        for (int i =1; i <= 10 ; i++) {
            System.out.println("Enter an integer: ");
            x =sc.nextInt();
            if (x % 2 ==0)
                totalEven += x; //total = total+x;
            else
                totaOdd +=x;

        }
        System.out.println("total of even number : "+totalEven);
        System.out.println("total of Odd number: "+totaOdd);

    }
}
