package quesDay2;

import java.util.Scanner;

public class ques4 {

    public static int findAns(int a , int b, int n){
       int aToPowerN = 1;
       int bToPowerN = 1;
        for(int i=1 ; i<= n ;i++){
          aToPowerN *= a;
          bToPowerN *= b;
       }
       return aToPowerN + bToPowerN;
    }
    public static void main(String[] args) {
        
        System.out.print("Enter values of a , b , n ");
         Scanner sc = new Scanner(System.in);
   
         int a= sc.nextInt();
         int b= sc.nextInt();
         int n= sc.nextInt();

         int ans = findAns(a,b,n);
           System.out.println(ans);

    }
}
