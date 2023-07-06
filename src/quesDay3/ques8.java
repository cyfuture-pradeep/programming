package quesDay3;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter X , N No : ");

        int x = sc.nextInt();
        int n = sc.nextInt();
        double rkip = (Math.pow(x, n)-1);
        double cm1 = x-1;

        System.out.println((int)(x*rkip/cm1));

    }
}
