import java.awt.*;
import java.applet.*;
public class Shapes extends Applet
{
public void paint(Graphics g)
{
//g.setFont(new Font("Arial",Font Bold,10));
g.drawString("Different shapes",150,10);
g.drawLine(10,10,50,50);
g.drawRect(10,60,40,30);
g.setColor(Color.red);
g.fillOval(60,10,30,80);
g.fillRoundRect(20,110,60,30,5,5);
g.fillArc(60,125,80,40,180,180);
}
}
/* <applet code=Shapes height=300 width=300>
</applet>*/