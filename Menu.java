import java.io.*;
class Siddharthcha
{
public static void main(String args[]) throws Exception
{
int choice,num;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("menu...");
System.out.println("1.find +ve/-ve");
System.out.println("2.odd/even");
System.out.println("enter the choice");
choice=Integer.parseInt(br. readLine());
switch(choice)
{
case 1:
	System.out.println("enter the number");
	num=Integer.parseInt(br.readLine());
if (num>0)
	System.out.println("ha number +ve aahe");
else
	System.out.println("ha number sadhya band aahe");
break;

case 2:
	System.out.println("enter the number");	
num=Integer.parseInt(br.readLine());
if (num%2==0)
	System.out.println("ha number changla aahe");
else
	System.out.println("ha number vait aahe");
break;

default:

System.out.println(" ha number sadhya vyasta aahe..... krupaya thodya velanantar doka vaprun number taaka");
}
}
}
