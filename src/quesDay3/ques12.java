package quesDay3;

import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two No's : ");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        
        for(int i = x ; i <= y ; i++){
        ans += i*i;
        }

        System.out.println(ans);

    }
}
