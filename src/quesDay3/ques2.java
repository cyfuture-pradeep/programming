package quesDay3;

import java.util.Scanner;

public class ques2 {

    public static String substr(String  s , int n){
          
        if(n >= s.length()){
            System.out.println("Invalid Operation");
            return "";
        }

         String part = "";

         for(int i = 0 ; i <= n ; i++){
            part += s.charAt(i);
         }

         return part;
    }
    public static void main(String[] args) {
         System.out.print("Enter String and no : ");
       Scanner sc = new Scanner(System.in); 
       String s = sc.next();
       int n = sc.nextInt();

       String partString = substr(s , n);

       System.out.println("SubString of s is : "+ partString);
    }
}
