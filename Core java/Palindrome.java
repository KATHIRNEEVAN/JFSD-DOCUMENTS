import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("type 0 to check number is a palindrome type 1 to check string : ");
        int num =  sc.nextInt();
        if (num==0){
            int number = sc.nextInt();
            int n=number;
            int sum = 0;
            while(n>0){
                int res=n%10;
                sum=sum*10+res;
                n=n/10;
            }
            if(number == sum){
                System.out.println(number+" is a palindrome");
            }
            else{
                System.out.println(number+" is a Not palindrome");
            }
        }
        else if (num==1){
           String str = sc.next();
           int left =0;
           int right = str.length()-1;
           boolean flag = true;
           while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=false;
                System.out.println(str+" is not a palindrome");
            }
            if(flag==false){
                break;
               }
            left++;
            right--;
           }
           if(flag){
            System.out.println(str+" is a palindrome");
           }
         }
         else{
             System.out.println("Invalid type");
        }
        sc.close();
    }
}
