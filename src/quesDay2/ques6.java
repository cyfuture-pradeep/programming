package quesDay2;

import java.util.Scanner;

public class ques6 {

    public static void findAns(int n ,int m){
       int nToPowerM = 1;
       int no = n*n*n;
        System.out.println(no);
        for(int i=1 ; i<m ;i++){
          no *= n;
          System.out.println(no);  
       }
   
    }
    public static void main(String[] args) {
        
        System.out.print("Enter values of m ,n : ");
         Scanner sc = new Scanner(System.in);
   
        
         int n= sc.nextInt();
         int m= sc.nextInt();

          findAns(n,m);
          

    }
}
