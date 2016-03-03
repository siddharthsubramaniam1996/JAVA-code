import java.awt.*;
import java.applet.*;
/*
<applet code="ColorDemo" width=300 height=200>
</applet>
*/
public class ColorDemo extends Applet
{
public void paint (Graphics g)
{
Color c1=new Color (255,70,50);
Color c2=new Color (50,255,50);
Color c3=new Color (50,50,255);
g.setColor(c1);
g.drawOval(10,10,70,70);
g.fillOval(70,90,140,100);

g.setColor(c2);
g.drawOval(190,10,100,30);
g.drawRect(10,10,80,50);

g.setColor(c3);
g.fillRect(100,10,100,50);
g.drawRoundRect(190,10,100,50,15,15);

g.setColor(Color.red);
g.drawLine(0,0,100,90);

g.setColor(Color.blue);

g.drawLine(40,25,250,180);
g.drawLine(75,90,400,400);

g.setColor(Color.cyan);

g.drawLine(20,150,400,40);
g.drawLine(5,290,80,19);
}
}


