package quesDay1;
import java.util.Scanner;

public class ques2 {
    public static String printN(int no , int fq){
        String s = new String("");
         for(int i=0;i<fq;i++){
            s += no;
        }
        return s;
    }

    public static void main(String[] args) {
      System.out.print("Enter number ");
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      for(int i = 1 ; i <= n ; i++){
        String part = printN(i , n);
        System.out.println(part);
      }
    }
}
