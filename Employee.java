import java.lang.*;
import java.io.*;
class Employee
{
int emp_id;
String emp_name;
float basic_salary;
Employee(int a,String s,float f)
{
emp_id=a;
emp_name=s;
basic_salary=f;
}
void display()
{
float da= basic_salary*15/100;
float hra=basic_salary*10/100;
float gross_salary=basic_salary+hra+da;
System.out.println("Employee id="+emp_id+"gross salary=" +gross_salary);
}
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter emp_id:");
int x=Integer.parseInt(in.readLine());
System.out.println("Enter emp_name ");
String n=in.readLine();
System.out.println("Enter basic salary");
float f=Float.parseFloat(in.readLine());
Employee e=new Employee(x,n,f);
e.display();
}
}