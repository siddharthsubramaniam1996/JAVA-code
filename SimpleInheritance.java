class Super
{
	int i,j;
	void show()
{
	System.out.println("i and j: ");
	System.out.println( + i  +"  "+j);
}
}
class Sub extends Super
{
int k;
void display()
{
System.out.println("k: " +k);
}
void sum()
{
System.out.println(" i+j+k: " +(i+j+k));
}
}
class SimpleInheritance
{
public static void main(String args[])
{
Super a=new Super();
Sub b=new Sub();
a.i=5;
a.j=12;
System.out.println("Contents of Super : ");
b.i=11;
b.j=13;
b.k=17;
System.out.println("Contents of sub= :");
b.show();
b.display();
System.out.println();
System.out.println("sum of i,j and k in sub: ");
b.sum();
}
}