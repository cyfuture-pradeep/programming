package quesDay3;

import java.util.Scanner;

public class ques6 {

    public static void printPattern(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
              if(j%3 == 1) System.out.print("A");
              if(j%3 == 2) System.out.print("B");
              if(j%3 == 0) System.out.print("X");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
         System.out.print("Enter No : ");
       Scanner sc = new Scanner(System.in); 

       int n = sc.nextInt();

       printPattern(n);
    }
}
