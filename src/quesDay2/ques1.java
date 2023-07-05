package quesDay2;

import java.util.*;

public class ques1 {
    
    public static void drowPattern(int no , int frq){
        for(int i = 2 ; i <= frq; i++){
             System.out.print(no*i + "#");
        }
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter no and frq : ");
        Scanner sc = new Scanner(System.in);
          int no = sc.nextInt();
          int frq = sc.nextInt();

          drowPattern(no , frq);
        
    }
}
