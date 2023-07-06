package quesDay3;

import java.util.Scanner;

public class ques4 {

  public static String MakeString(Character c1 , Character c2 , int fq){
    String ans1 = "";
    String ans2 = "";

    for(int i = 0 ; i < fq ; i++){
        ans1 += c1;
        ans2 += c2;
    }

    return ans1 + ans2;
  }
    public static void main(String[] args) {
         System.out.print("Enter Two Char and no : ");
       Scanner sc = new Scanner(System.in); 
       Character ch1 = sc.next().charAt(0);
       Character ch2 = sc.next().charAt(0);
       int n = sc.nextInt();

       String partString = MakeString(ch1 , ch2, n);

       System.out.println("SubString of s is : "+ partString);
    }
}
