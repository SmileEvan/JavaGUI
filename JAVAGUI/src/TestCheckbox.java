import java.awt.*;
import java.awt.event.*;
public class TestCheckbox {
	Checkbox cb1=new Checkbox("��Ҫѡ����",true);
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox cb2=new Checkbox("ѡ��",cbg,true);
	Checkbox cb3=new Checkbox("��ѡ��",cbg,false);
	public void init()
	{
		Frame f=new Frame("TestCheckbox");
		FlowLayout f1=new FlowLayout();
		f.setLayout(f1);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		cb1.addItemListener(new CBItemListener());
		cb2.addItemListener(new CBItemListener());
		cb3.addItemListener(new CBItemListener());
		f.setBounds(0,0,300,100);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	class CBItemListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			Checkbox cb=(Checkbox)e.getItemSelectable();
			if(cb.getLabel().equals("��Ҫѡ����"))
			{
				if(cb.getState()==true)
				    System.out.println("��ѡ���˻���");
				else
					System.out.println("��ʧȥ�˻���");
			}
			else
			{
				Checkbox cbx=cbg.getSelectedCheckbox();
				if(cbx!=null)
					System.out.println(cbx.getLabel());
			}
		}
	}
	public static void main(String[] args) {
		new TestCheckbox().init();
	}
}
