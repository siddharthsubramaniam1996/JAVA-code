import java.awt.*;
import java.applet.*;
/*
<applet code="MyLabelDemo" width=900 height=400>
</applet>
*/
public class MyLabelDemo extends Applet
{
public void init()
{
Label first = new Label("India");
Label second=new  Label("Mumbai");
Label third=new Label("Pusad");
add(first);
add(second);
add(third);
}
}