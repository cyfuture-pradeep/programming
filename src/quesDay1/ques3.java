package quesDay1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ques3 {

    public static int hasVovel(String s){
        int vCount = 0;

        for(int i =0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vCount++;
            }
        }

        return vCount;
    }
    public static void main(String[] args) {
        
        int finalVovelCount = 0;
       System.out.print("Enter String Array size ");
      Scanner sc = new Scanner(System.in);
      int  fq = sc.nextInt();
      
      List<String> ele = new ArrayList<>();
      for(int i = 0 ;  i < fq ; i++){
        String input = sc.next();
          ele.add(input);
      }

       for(int i = 0 ;  i < fq ; i++){
        String data = ele.get(i);
        int dataVovelCount = hasVovel(data);
        if(dataVovelCount > 0){
            System.out.println(data);
            finalVovelCount += dataVovelCount;
        }
      }

      System.out.println("Totel Vovel in ArrayList is : " + finalVovelCount);
      
    }
}
