import java.util.*;
public class Factorial {
    public static int factorial(int num){
        if(num==0){
           return 0;
        }
        if(num==1){
            return 1;
        }
        return factorial(num-1)+factorial(num-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
    }
}
