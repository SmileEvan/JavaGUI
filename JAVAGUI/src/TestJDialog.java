import javax.swing.*;
import java.awt.event.*;
public class TestJDialog {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"����ʼ����");
		String str=JOptionPane.showInputDialog(null,"�����������");
		while(!str.equals("neuneu"))
		{
			JOptionPane.showMessageDialog(null,"������������������");
			str=JOptionPane.showInputDialog(null,"�����������");
		}
		final JFrame f=new JFrame("TestJDialog");
		
		
		f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		//f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				int retval=JOptionPane.showConfirmDialog(f,"�����Ҫ������","��������",JOptionPane.YES_NO_OPTION);
				if(retval==JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		f.setSize(200,200);
		f.setVisible(true);
	}
}
