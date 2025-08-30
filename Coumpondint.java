import java.util.*;
class Compoundint
{
    public static void main (String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Principle amt");
     double p =sc.nextDouble();
     System.out.println("Enter the rate");
     double r=sc.nextDouble();
     System.out.println("Enter the time period you want in yrs only or months");
     double t=sc.nextDouble();
     double po=Math.pow((1+r/100),t);
     double cal = p*po;
     System.out.println("Your compound intrest is \n"+cal);
    }
}