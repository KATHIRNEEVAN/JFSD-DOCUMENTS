import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int isprime = sc.nextInt();
        boolean flag=true;
        if(1==isprime || isprime==2){
            System.out.println(isprime+" is a prime number");
        }
        for(int i=2;i<isprime*0.5;i++){
            if(isprime%i==0){
                System.out.println(isprime+" is not prime");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(isprime+" is a prime number");
        }
        
        sc.close();
    }
}
