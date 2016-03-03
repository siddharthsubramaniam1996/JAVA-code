class FactorialDemo
{
int num=5;
int avg;
public void factorial()
{

{
avg=3.14*num*num;
}
System.out.println("Number is: "+num);
System.out.println("Factorial of number is: "+avg);
}
}
class JavaFactorial
{
public static void main(String args[])
{
FactorialDemo obFactorialDemo = new FactorialDemo();
obFactorialDemo.factorial();
}
}