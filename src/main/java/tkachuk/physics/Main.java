package tkachuk.physics;
import java.util.Scanner;

public class Main
{
    static double ang1;
    static double ang2;
    static double mag1;
    static double mag2;
    static double ang3;
    static double mag3;
    public static void main(String[] args)
    {
        numIn();
        findAngMag();
    }

    private static void findAngMag()
    {
        //Triangle 1
        double xVal1 = Math.cos(ang1) * mag1 ;
        double yVal1 = Math.sin(ang1) * mag1;


        //Triangle 2
        double xVal2 = Math.cos(ang2) * mag2;
        double yVal2 = (Math.sin(ang2) * mag2);
        if(yVal2 > 90)
            yVal2 = yVal2 * -1;

        //combining xs and ys
        double xEs = xVal1 + xVal2;
        double yEs = yVal1 + yVal2;

        //finding the angle
        double num = (xEs * xEs) + (yEs * yEs);
        ang3 = Math.sqrt(num);

        //finding magnitude
        mag3 = Math.atan(yEs / xEs);
        double result = Math.toDegrees(mag3);

        //print the result
        System.out.println("The angle is: ");
        System.out.format("%.2f", ang3);
        System.out.println("\n" + "The degree is ");
        System.out.format("%.2f", result);

    }

    private static void numIn()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter angle 1: ");
        ang1 = scn.nextDouble();
        System.out.println("Please enter magnitude 1: ");
        mag1 = scn.nextDouble();
        System.out.println("Please enter angel 2: ");
        ang2 = scn.nextDouble();
        System.out.println("Please enter magnitude 2: ");
        mag2 = scn.nextDouble();

    }
}
