import java.util.Scanner;
public class Big {
    public static void main(String big[]){
        Scanner inp = new Scanner(System.in);
        int a,b;
        a=inp.nextInt();
        b=inp.nextInt();
        if(a>b){
            System.out.println("Max number "+a);
        }
        else{
            System.out.println("Max number "+b);
        }
        inp.close();



    }
}
