package quesDay3;

import java.util.Scanner;

public class ques5 {

    public static String moreDigit(String s1 , String s2){
       int noOfDigit1 = 0;
       int noOfDigit2 = 0;
        for(int i = 0 ; i < s1.length() ; i++){
          if((int)s1.charAt(i) >= 48 || (int)s1.charAt(i) <= 57){
            noOfDigit1++;
          }
        }
        for(int i = 0 ; i < s2.length() ; i++){
          if((int)s2.charAt(i) >= 48 || (int)s2.charAt(i) <= 57){
            noOfDigit2++;
          }
        }

        if(noOfDigit1 > noOfDigit2) return s1;
        return s2;
    }
    public static void main(String[] args) {
         System.out.print("Enter Two String : ");
       Scanner sc = new Scanner(System.in); 
       String s1 = sc.next();
       String s2 = sc.next();
       
     String ans =  moreDigit(s1 , s2);

     System.out.println("More digit String is : "+ ans);
    }
}
