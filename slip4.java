import java.awt.*;
import java.awt.event.*;
class slip4 extends Frame
{
	TextField t1;
	slip4()
	{
		t1=new TextField(20);
		add(t1);
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		addMouseListener(new MouseAdapter()
		{
			public void
			mouseClicked(MouseEvent m)
			{
				t1.setText(m.getX()+" "+m.getY());
			}
		}
		);
	}
	public static void main(String arg[])
	{
		new slip4();
	}
}