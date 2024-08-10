import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] strarray = input.split(" ");
        int array[]=new int[strarray.length];
        for(int i =0;i<strarray.length;i++){
            String a=strarray[i];
            array[i]=Integer.parseInt(a);
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        scanner.close();
    }
}