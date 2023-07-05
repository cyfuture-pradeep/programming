package quesDay2;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        for(int i = 1;i<= n ;i++){
            for(int j = 1 ; j <= i ; j++)
            System.out.print("X"+j);
            System.out.println();
        }
        
    }
}
