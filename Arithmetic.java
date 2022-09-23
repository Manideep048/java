import java.io.*;
import java.util.Scanner;
class Arithmetic
{
    void Add(int x,int y)
    {
        System.out.println("Sum of "+x+ " and "+y+" is "+(x+y));
    }
}
class Adder extends Arithmetic
{
    void Add(double x,double y)
    {
        System.out.println("Sum of "+x+ " and "+y+" is "+(x+y));
    }
    void Add(String x,String y)
    {
        System.out.println("Sum of "+x+ " and "+y+" is "+(x+y));
    }
}
class sum
{
    public static void main(String args[])
    {
        int c,k=1;
        Scanner s = new Scanner(System.in);
        Adder ad = new Adder();
        while(k!=0)
        {
            System.out.println(" 1 : Addition of two integer");
            System.out.println(" 2 : Addition of two decimal number");
            System.out.println(" 3 : Concatenation of String");
            System.out.println(" 4 : Exit");
            System.out.print("Enter your choice:");
            c=s.nextInt();
            if(c==1)
            {
                int a,b;
                System.out.print("Enter the first integer:");
                a=s.nextInt();
                System.out.print("Enter the second integer:");
                b=s.nextInt();
                ad.Add(a,b);
            }
            else if(c==2)
            {
                System.out.print("Enter the first decimal integer:");
                float m=s.nextFloat();
                System.out.print("Enter the second decimal integer:");
                float n=s.nextFloat();
                ad.Add(m,n);
            }
            else if(c==3)
            {
                System.out.print("Enter the first string:");
                String k1 = s.next();
                //  char k1=str.charAt(0);
                System.out.print("Enter the second string:");
                String l = s.next();
                //  char l=str1.charAt(0);
                ad.Add(k1,l);
            }
            else if(c==4)
                break;
            else
                System.out.println("Enter a valid choice");
        }
    }
}
