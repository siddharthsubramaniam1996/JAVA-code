import java.util.*;
public class VectorExample
{
public static void main(String args[])
{
Vector v=new Vector(3,2);
System.out.println("initial size: "+v.size());
System.out.println("initial capacity" +v.capacity());

v.addElement(new Integer(1));

v.addElement(new Integer(2));

v.addElement(new Integer(3));

v.addElement(new Integer(4));

System.out.println("Capacity  after 4 additions : "+v.capacity());
v.addElement(new Double(5.45));
System.out.println("Current capaity: "+v.capacity());
v.addElement(new Double(6.08));
v.addElement(new Integer(7));
System.out.println("current capacity " +v.capacity());
v.addElement(new Float(9.4));
v.addElement(new Integer(10));
System.out.println("Current capacity: "+v.capacity());
v.addElement(new Integer(11));
v.addElement(new Integer(12));
System.out.println("First element: "+(Integer)v.firstElement());
System.out.println("First element: "+(Integer)v.lastElement());

if(v.contains(new Integer(3)))
System.out.println("vector contains  3");
Enumeration vEnum=v.elements();
System.out.println("\n elements in vector: ");
while(vEnum.hasMoreElements())
System.out.println(vEnum.nextElement() + " ");
System.out.println();
}
}

