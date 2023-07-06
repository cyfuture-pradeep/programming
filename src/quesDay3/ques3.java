package quesDay3;

import java.util.Scanner;

public class ques3 {
     
    public static boolean sumSame(int a , int b , int c){
        int mxEle = Math.max(c , Math.max(a, b));
        return (a+b+c-mxEle == mxEle);
    }
    public static void main(String[] args) {
       System.out.print("Enter numbers a ,b,c : ");
       Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println( sumSame(a , b, c));
    }
}
