package quesDay3;

import java.util.Scanner;

public class ques14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        
     int n = sc.nextInt();
     int ans = 0;

     while(n > 0){
        ans += n%10;
        n /= 10;
     }
     System.out.println("Sum Of Digit is : " + ans);
        
    }

         

}
