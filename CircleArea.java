import java.io.*;
class FactorialDemo
{
int num1=10;
int num2=1;
public void factorial()
{
fact=num1+num2;
}

System.out.println("Area of number is:" + fact);
}
}

class CircleArea
{
public static void main(String args[])
{
FactorialDemo obFactorialDemo = new FactorialDemo();
obFactorialDemo.factorial();
}
}