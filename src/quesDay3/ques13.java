package quesDay3;

import java.util.Scanner;

public class ques13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        
            int n = sc.nextInt();

            System.out.println("Last digit : " + n%10);
            System.out.println("Remaining No : " + n/10);
        
    }

         

}
