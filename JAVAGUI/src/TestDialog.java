import java.awt.*;
import java.awt.event.*;
public class TestDialog {
    TextField tf=new TextField(10);
    Button b1=new Button("ģ̬��ʾ");
    Button b2=new Button("��ģ̬��ʾ");
    Frame f=new Frame("TestDialog");
    Button b3=new Button("ȷ��");
    Dialog dlg=new Dialog(f,"Dialog Title",true);
    FlowLayout f1=new FlowLayout();
    TestDialog()
	{
    	f.setLayout(f1);
    	f.add(tf);
    	f.add(b1);
    	f.add(b2);
    	b1.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    		   dlg.setModal(true);
    		   dlg.setVisible(true);
    		   tf.setText("ģ̬��ʾ");
    		}
    	});
    	b2.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			dlg.setModal(false);
    			dlg.setVisible(true);
    			tf.setText("��ģ̬��ʾ");
    		}
    	});
    	f.setBounds(0,0,400,200);
     	f.setVisible(true);
    	f.addWindowListener(new WindowAdapter()
    	{
    		public void windowClosing(WindowEvent e)
    		{
    			System.exit(0);
    		}
    	});
    	dlg.setLayout(f1);
    	dlg.add(b3);
    	b3.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e){
    			dlg.dispose();
    		}
    	});
    	dlg.setBounds(0,0,200,150);

	}
	public static void main(String[] args) {
		new TestDialog();
	}
}
