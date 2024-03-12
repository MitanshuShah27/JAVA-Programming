//Write a code which ask user name and greet them with Hello <name> have a good day
import java.util.Scanner;
public class greating
{
    public static void main(String [] arg)
    {
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        n = sc.nextLine();
        System.out.println("Hello "+n+" have a good day");
    }
}