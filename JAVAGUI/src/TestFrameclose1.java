import java.awt.*;
import java.awt.event.*;
public class TestFrameclose1 implements ActionListener
{
	Frame f=new Frame("Window Can Be Closed");
	public static void main(String[] args)
	{
		TestFrameClose tf=new TestFrameClose();
		
		Button btn=new Button("�˳�");
		btn.addActionListener(new TestFrameclose1());//ע���¼�����������
		tf.f.add(btn);
		tf.f.setSize(300,300);
		tf.f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		f.setVisible(false);
		f.dispose();
		System.exit(0);
	}
}