import java.awt.*;
import java.applet.*;
/*
<applet code="MyButtonDemo" width=250 height=150>
</applet>

*/

public class MyButtonDemo extends Applet
{
Button ok,cancel,apply;
public void init()
{
ok=new Button("SID");
cancel=new Button("Cancel");
apply=new Button("Apply");

add(ok);
add(cancel);
add(apply);
}
}