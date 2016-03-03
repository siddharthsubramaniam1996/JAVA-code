import java.awt.*;
import java.applet.*;
public class Rectangle extends Applet
{
public void paint(Graphics g)
{
g.drawRoundRect(10,10,50,50,5,5);
g.drawOval(30,10,90,80);
g.fillOval(90,10,90,80);
g.setColor(Color.bluecd);
g.drawArc(20,- 25,150,90,180,95);
}
}
/* <applet code=Rectangle height=400 width=500>
</applet>*/