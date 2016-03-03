import java.applet.*;
import java.awt.*;
public class SampleFonts extends Frame
{

Font f;
String msg;
public void init()

{

f=new Font ("Dialog", Font.PLAIN,12);
msg="Tanmay Gurunani";
setFont(f);

}

public void paint(Graphics g)

{

g.drawString(msg,4,20);

}

public static void main(String args[])

{

SampleFonts f=new SampleFonts();

f.setVisible(true);

f.setSize(200,200);

}

}