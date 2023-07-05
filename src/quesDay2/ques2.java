package quesDay2;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
         System.out.print("Enter number ");
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      for(int i=1; i<= n; i++){
        System.out.println("A"+i+"B"+i);
      }
    }
}
