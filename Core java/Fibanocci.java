import java.util.*;
public class Fibanocci {
      
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int fibb = sc.nextInt();
      for(int i=0;i<fibb;i++){
        System.out.print(fibbo(i)+" ");
      }
      sc.close();
    }
    public static int fibbo(int fibb){
      if(fibb<=1){
        return fibb;
     }
     return fibbo(fibb-1)+fibbo(fibb-2);

    }
}
