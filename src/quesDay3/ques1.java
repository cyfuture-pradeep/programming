package quesDay3;

import java.util.Scanner;

public class ques1 {

    public static int findCube(int n){
        int ans = n*n*n;
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter No : ");
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();
       int ans = findCube(n);
       System.out.println("Cube of no is : "+ ans);
    }
}
