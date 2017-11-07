import java.awt.*;
import java.awt.event.*;
class MyButton extends Button
{
	private MyButton friend;
	public void setFriend(MyButton friend)
	{
		this.friend = friend;
	}
	public MyButton(String name)
	{
		super(name);
		enableEvents(AWTEvent.MOUSE_MOTION_EVENT_MASK);
	}
	protected void processMouseMotionEvent(MouseEvent e)
	{
		setVisible(false);
		friend.setVisible(true);
	}
}
public class TestMyButton
{
	public static void main(String [] args)
	{
		MyButton btn1 =new MyButton("button1");
		MyButton btn2 =new MyButton("button2");
		btn1.setFriend(btn2);
		btn2.setFriend(btn1);
		btn1.setVisible(false);
		Frame f =new Frame("My Frame");
		f.add(btn1, "North");//��btn1���ӵ�f�ı���
		f.add(btn2, "South");//��btn2���ӵ�f���ϲ�
		f.setSize(300,300);
		f.setVisible(true);
		btn1.setVisible(false);
		
			
	}
}