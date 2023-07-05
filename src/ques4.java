import java.util.Scanner;

public class ques4 {

    public static boolean isPrime(int no){
       for(int i=2 ; i*i<=no ; i++){
      if(no % i == 0) return false;
  }

        return true;
    }
    public static void main(String[] args) {
         System.out.print("Enter number ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i = 2 ; i <= n ; i++){
          if(isPrime(i) == true){
            System.out.print(i + " ");
          }
      }

    }
}

