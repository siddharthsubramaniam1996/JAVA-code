import java.awt.*;
import java.applet.*;
public class Joker extends Applet
{
public void paint(Graphics g)
{
g.drawOval(20,10,80,80);


g.drawOval(90,10,40,80);
g.drawOval(90,20,40,80);
g.drawOval(90,30,40,80);
g.drawOval(90,40,40,80);

g.drawOval(60,130,40,40);
g.setColor(Color.red);
g.fillOval(20,10,80,80);





}
}
/* <applet code=Joker height=300 width=300>
</applet>*/