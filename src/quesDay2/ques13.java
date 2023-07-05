package quesDay2;

public class ques13 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1 ; i <= 8 ; i++){
            sum += i*i*i;
        }

        System.out.println("Sum of the cube of 1-8 is : "+sum);
    }
}
