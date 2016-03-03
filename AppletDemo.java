import java.awt.*;
import java.applet.*;
public class AppletDemo extends Applet
{
String msg;
public void init()
{
		msg=getParameter("Str");
		if(msg==null)
		msg="Jasta havaa karu nakos";
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,10,100);
	}
}
/*<applet code=AppletDemo.class height=300 width=900>
<param name="str" value="welcome to applet programming">
</applet>*/