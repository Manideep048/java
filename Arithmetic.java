import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Arithmetic
{
    Arithmetic(){

    }
}
class Adder extends Arithmetic{
    Adder(){

    }
    int add(int a, int b){
        return a+b;
    }
}
    class solution{
    public static void main(String Args[]){
    Adder a = new Adder();
    System.out.println("MY super is:" + a.getClass().getSuperclass().getName());
    System.out.println(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + " \n ");
    }
}
