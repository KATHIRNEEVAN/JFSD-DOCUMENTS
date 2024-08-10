import java.util.Scanner;
public class Main{
    public static void main(String hell[]) throws Exception
    {
        int employeeId;
        String employeeName;
        float employeeSalary;
        Scanner input=new Scanner(System.in);
        employeeId = input.nextInt();
        employeeName = input.next();
        employeeSalary = input.nextFloat();
        System.out.println("Employee Id "+employeeId);
        System.out.println("Employee Name "+employeeName);
        System.out.println("Employee Salary "+employeeSalary);
        input.close();


    }
}