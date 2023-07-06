package quesDay3;

import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");

        int n = sc.nextInt();
 
        String divide = "";
        String nDivide = "";

        for(int i = 1 ; i <= n ;i++){
            if(n % i == 0){
                divide += i + "#";
            }else{
                nDivide += i + "#";
            }
        }

        System.out.println("Divide : " + divide.substring(0 ,divide.length()-1));
        System.out.println("Not_Divide : " + nDivide.substring(0 ,nDivide.length()-1));

    }
}
