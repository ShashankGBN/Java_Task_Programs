/* Write a program to find area of a circle by passing different radius. formula = pie * r2

 import java.util.Scanner;
class Circle
{
public static void area(double r)
{
Scanner scan = new Scanner(System.in);
System.out.println("radius of circle=");
r = scan.nextInt();
double a=(3.1428*(r*r));
System.out.println("area of circle =" +a);
}
public static void main(String [] args)
{
area(6.0);
}
}
*/


import java.util.Scanner;
class Circle
{
public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Radius of the Circle=");
double r = scan.nextDouble();
System.out.println(area(r));
}
public static double area(double r)
{
double a=(3.1428*(r*r));
return a;
}
}






















































//