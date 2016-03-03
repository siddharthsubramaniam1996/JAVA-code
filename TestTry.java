import java.io.*;
class TestTry
{
public static void main(String args[])
{
int x=10,y=0,z;
try
{
System.out.println("Entered in try block");
z=x/y;
System.out.println("END OF TRY BLOCK");
}
catch(ArithmeticException e)
System.out.println("divide by zero error");
}
System.out.println("After catch block");
}
}