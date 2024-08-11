import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arm = sc.nextInt();
        int len = String.valueOf(arm).length();
        int temp=arm;
        int res=0;
        while(temp>0){
            int rem = temp%10;
            res+=Math.pow(rem,len);
            temp=temp/10;
        }
        if(arm == res){
            System.out.println(arm+" is a armstrong number");
        }
        else{
            System.out.println(arm+" Not a armstrong number");
        }
        sc.close();
    }
}
