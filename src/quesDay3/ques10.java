package quesDay3;

import java.util.Scanner;

public class ques10 {

    public static void showSpecificPattern(int n){
        boolean flage = true;
        int ans = 1;

        for(int i = 1; i<= n ;i++){
            if(i == 1) System.out.print("+" + i);
            else{
                System.out.print((flage ? "+" : "-" ) + i);
                if(flage == true) ans += i;
                else ans -= i; 
            }
            flage = !flage;

            if(i == n){
                System.out.print("=" + ans);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");

        int n = sc.nextInt();
         showSpecificPattern(n);
    }
}
