class Siddharth
{

int p,q;
void show()

{

System.out.println("first number and second number: ");
System.out.println( + p  +"  "+q);

}

}
class Sub extends Siddharth

{
int k;
void display()
{
System.out.println("third number : " +k);
}

void sum()

{
System.out.println(" first number+second number+third numer: " +(p+q+k));
}

}
class Sid_Inheritance
{
public static void main(String args[])
{
Siddharth a=new Siddharth();
Sub b=new Sub();
a.p=5;
a.q=12;
System.out.println("Contents of Siddharth's class : ");
b.p=11;
b.q=13;
b.k=17;
System.out.println("Contents of sub= :");
b.show();
b.display();
System.out.println();
System.out.println("sum of first number ,second number and third number in sub: ");
b.sum();
}
}