//Write a code to convert millimeter to miles
import java.util.Scanner;
public class mm_to_mi
{
    public static void main(String [] arg)
    {
        Double mm,mi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in mm");
        mm = sc.nextDouble();
        mi = (mm*0.0006213)/1000;
        System.out.println(mm+" mm = "+mi+" mi");
    }
}