package quesDay3;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");

        int n = sc.nextInt();

        int ans = (int)(3*(Math.pow(3, n)-1)/2);

        System.out.println(ans);

    }
}
