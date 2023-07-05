package quesDay2;

import java.util.Scanner;
public class ques3 {

    public static int showPatternReturnAns(int n){
    int ans = 0;
    int flage = 1;

    for(int i=1; i <= n ;i++){
        if(i == 1) System.out.print(i);
         else
        System.out.print((flage >= 0 ? "+" : "-")+i);
        if(i == n) System.out.print("=");
        if(flage >= 0){
            ans += i;
            flage--;
        }else{
            ans -= i;
            flage = 1;
        }
    }
   
        return ans;
}

    public static void main(String[] args) {
      System.out.print("Enter number ");
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int ans = showPatternReturnAns(n);

      System.out.println(ans);
    }
}
