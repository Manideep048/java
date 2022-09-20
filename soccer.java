import java.lang.*;
import java.util.*;
class sport
{
    void getName(){
        System.out.println("MANIDEEP");
    }
    void getNumber(){
        System.out.println("5");
    }
}
class soccer extends sport
{
    void getName()
    {
        System.out.println("MANIDEEP");
    }
    void getNumber(){
        System.out.println("7");
    }
}
class Answer
{
    public static void main(String Args[])
    {
        soccer c = new soccer();
        c.getName();
        c.getNumber();
    }
}
