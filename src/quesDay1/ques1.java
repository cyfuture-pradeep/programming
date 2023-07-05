package quesDay1;
import java.util.*;


public class ques1 {
    public static Map<Character,Integer> mp = new LinkedHashMap<Character,Integer>();
    public static void countChar(char c , String s){
         if(mp.containsKey(c)){
            mp.put(c, mp.get(c)+1);
         }else{
             mp.put(c, 1);
         }
    }
    public static void main(String[] args) {

        System.out.print("Enter String ");
      Scanner sc = new Scanner(System.in);

 
      String s = sc.next();
     for(int i = 0 ; i < s.length() ; i++){
        countChar(s.charAt(i), s);
     }

     for(Map.Entry<Character,Integer> mp : mp.entrySet()){
        System.out.println(mp) ;
     }

   // for(int i = 0 ; i < s.length() ; i++){
   //    char ch = s.charAt(i);
   //   System.out.println(ch + " -> " + mp.get(s.charAt(i)));
   // }
      
    }
}
