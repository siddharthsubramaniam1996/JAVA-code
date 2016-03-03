import java.awt.*;
import java.applet.*;
/*
<applet code="MyLabelAndButtonDemo" width=900 height=400>
</applet>
*/
public class MyLabelAndButtonDemo extends Applet
{
public void init()
{
Button ok,cancel,apply;
Label first = new Label("India");
Label second=new  Label("Mumbai");
Label third=new Label("Pusad");
add(first);
add(second);
add(third);
ok=new Button("ok");
cancel=new Button("Cancel");
apply=new Button("Apply");

add(ok);
add(cancel);
add(apply);
}
}

