package quesDay2;

import java.util.Scanner;

public class ques5 {

    public static int findAns(int n ,int m){
       int nToPowerM = 1;
        
        for(int i=1 ; i<= m+2 ;i++){
          nToPowerM *= n;
           
       }
       return nToPowerM;
    }
    public static void main(String[] args) {
        
        System.out.print("Enter values of m ,n : ");
         Scanner sc = new Scanner(System.in);
   
        
         int n= sc.nextInt();
         int m= sc.nextInt();

         int ans = findAns(n,m);
           System.out.println(ans);

    }
}
