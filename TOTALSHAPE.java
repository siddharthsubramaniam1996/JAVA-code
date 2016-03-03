import java.lang.*;
class Square
{
int length;
Square(int x)
{
length=x;
}
void area()
{
int area=length*length;
System.out.println("area of square is: "+area);
}
}

class Rectangle extends Square
{
int breadth;
super(x);
breadth=y;
}
void Reactarea()
{
int area1=length*breadth;
System.out.println("Area of reactangle is= " +area1);
}
}
class Box extends Rectangle	
{
int height;
Box(int x,int y,int z);
{
super (x,y);
height=z;
}
void volume()
{
int volume=length*breadth*height;
System.out.println("volume of box is = "+volume);
}
}
class TOTALSHAPE
{
public static void main(String args[])
{
Box b=new Box(10,20,30);
b.volume();
b.rectArea();
b.area();

}
}