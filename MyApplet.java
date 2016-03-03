import java.awt.*;
import java.applet.*;

/*
<applet code="MyApplet" width=200 height=200>
</applet>
*/


class MyFrame extends Frame
{
MyFrame(String title)
{
super(title);
}
public void paint(Graphics g)
{
g.drawString("This is in frame in applet",100,40);
}
}
public class MyApplet extends Applet
{
Frame f;
public void init()
{
f=new MyFrame("Aframe created by me");
f.setSize(250,250);
f.setVisible(true);
}

public void start ()

{
f.setVisible(true);
}
public void stop()
{
f.setVisible(false);
}
public void paint(Graphics g)
{
g.drawString("This is an applet",50,50);
}
}