import java.awt.*;
import java.awt.event.*;
public class TestFileDialog {
	Frame f=new Frame();
	FileDialog fg1=new FileDialog(f,"����",FileDialog.SAVE);
    FileDialog fg2=new FileDialog(f,"��",FileDialog.LOAD);
    Button b1=new Button("����");
	Button b2=new Button("��");
	TestFileDialog()
	{
		FlowLayout fl=new FlowLayout();
		f.setLayout(fl);
		f.add(b1);
		f.add(b2);
		f.setBounds(0,0,400,200);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				fg1.setVisible(true);
		    	System.out.println(fg1.getFile());
			}
		});
		b2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						fg2.setVisible(true);
					}
				});
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		new TestFileDialog();
	}
}
