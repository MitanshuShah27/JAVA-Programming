//Write a code to calculate CGPA of 3 subject
import java.util.Scanner;
public class CGPA
{
    public static void main(String [] arg)
    {
        int x,y,z,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1");
        x = sc.nextInt();
        System.out.println("Enter marks of subject 2");
        y = sc.nextInt();
        System.out.println("Enter marks of subject 3");
        z = sc.nextInt();
        result = (x+y+z)/3;
        System.out.println("CGPA = "+result);
    }
}