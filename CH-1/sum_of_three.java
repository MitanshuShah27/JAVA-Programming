//Write a code to sum three numbers 
import java.util.Scanner;
public class sum_of_three
{
    public static void main(String[] arg)
    {
        int x,y,z,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        x = sc.nextInt();
        System.out.println("Enter 2nd number");
        y = sc.nextInt();
        System.out.println("Enter 2rd number");
        z = sc.nextInt();
        sum = x+y+z;
        System.out.println("Sum = "+sum);
    }
}