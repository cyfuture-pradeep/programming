package quesDay3;

import java.util.Scanner;

public class ques9 {

    public static void showPattern(int n){
        for(int i=0 ; i<n; i++){
            for(int j = n; j >= n-i ;j--){
                if(j%3==0)System.out.print("X");
                else System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int n = sc.nextInt();

        showPattern(n);

    }
}
