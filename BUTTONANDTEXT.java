import java.awt.*;
import java.applet.*;
/*

<applet code="BUTTONANDTEXT" width=900 height=850>
</applet>
*/
public class BUTTONANDTEXT extends Applet
{
TextField name, pass;
Button ok,cancel,apply;

Button submit;
public void init()
{
Label namep=new Label("Name : ",Label.RIGHT);
Label passp=new Label("Password: ",Label.RIGHT);

name=new TextField(12);
pass=new TextField(8);

submit=new Button("LOGIN");
pass.setEchoChar('$');
add(namep);
add(name);
add(passp);
add(pass);
add(submit);

ok=new Button("Accept");
cancel=new Button("Cancel");


add(ok);
add(cancel);

}
public void paint(Graphics g)
{

g.drawOval(20,10,40,80);
g.drawOval(20,20,40,80);
g.drawOval(20,30,40,80);
g.drawOval(20,40,40,80);


g.drawArc(40,200,80,40,180,180);
g.fillArc(40,200,80,40,180,180);
g.setColor(Color.red);

g.drawOval(90,10,40,80);
g.drawOval(90,20,40,80);
g.drawOval(90,30,40,80);
g.drawOval(90,40,40,80);




g.drawOval(60,130,40,40);
g.fillOval(60,130,40,40);
g.setColor(Color.yellow);




}
}
