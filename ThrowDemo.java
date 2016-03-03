import java.io.*;
class  ThrowDemo
{
public static void main(String args[])
{
int x=10,y=20;
int z;
z=x+y;
try
{
throw new ArithmeticException();
}
catch (Exception e)
{
System.out.println("exception on caught");
System.out.println("addition : "+z);
}
}
}