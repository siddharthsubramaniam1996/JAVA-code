import java.io.*;
public class ExcepDemo
{
public static void main(String args[])
{
try
{
int a[]=new int[4];
System.out.println("Access element three :" +a[1]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Exception thrown :"+e);
}
System.out.println("out of the block");
}
}