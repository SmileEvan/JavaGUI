//TestFrame ���Թر� 

import java.awt.*;
import java.awt.event.*;
public class TestFrameClose  
{
	Frame f=new Frame("Window Can Be Closed");
	public static void main(String[] args)
	{
		TestFrameClose tf=new TestFrameClose();
		tf.init();
	}
	public void init()   
	{
		Button btn=new Button("�˳�");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
	       {
		  f.setVisible(false);
		   f.dispose();
		  System.exit(0);
	      }
		}
		
		);//ע���¼�����������
	
		f.add(btn);
		f.setSize(300,300);
		f.setVisible(true);
	}
	

}