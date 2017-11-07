import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.FileFilter;
public class TestJFileDialog extends JFrame{
	
	public void init()
	{
		JMenuBar mb=new JMenuBar();
		JMenu fileM,helpM;
		JMenuItem fileOpenItem, fileSaveItem,helpAboutItem;
		setJMenuBar(mb);
		
		fileM=new JMenu("�ļ�");
		fileOpenItem=new JMenuItem("��");
		fileOpenItem.addActionListener(new ItemActionListener());
		fileSaveItem=new JMenuItem("����");
		fileSaveItem.addActionListener(new ItemActionListener());
		fileM.add(fileOpenItem);
		fileM.add(fileSaveItem);
		
		helpM=new JMenu("����");
		helpAboutItem=new JMenuItem("����");
		helpM.add(helpAboutItem);
		mb.add(fileM);
		mb.add(helpM);
		setSize(300,300);
		
		this.show();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		new TestJFileDialog().init();
	}
	class ItemActionListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("��"))
						
			{
				JFileChooser fc=new JFileChooser();
				fc.setFileFilter(new JNotepadFileFilter());
				int option = fc.showOpenDialog(TestJFileDialog.this);	
			}
			else if(e.getActionCommand().equals("����"))
			{
				JFileChooser fc=new JFileChooser();
				fc.setSelectedFile(new File("*.txt"));	
				fc.setFileFilter(new JNotepadFileFilter());
				int option = fc.showSaveDialog(TestJFileDialog.this);
			}
				
				
			
		}
	}
	class JNotepadFileFilter extends FileFilter
	{
		public boolean accept(File f)
		{
			return f.getName().toLowerCase().endsWith(".txt") || f.isDirectory();
		}
		
		public String getDescription()
		{
			return "�ı��ĵ�(*.txt)";
		}	
	}

}
