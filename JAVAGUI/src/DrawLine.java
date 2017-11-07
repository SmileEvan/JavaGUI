import java.awt.*;
import java.awt.event.*;
public class DrawLine 
{
	Frame f=new Frame("DrawLine");
	public static void main(String[] args)
	{
		new DrawLine().init();
	}
	public void init()
	{
		f.setSize(300,300);
		f.setVisible(true);
	
		f.addMouseListener(new MouseAdapter()
		{
			int orgX;
			int orgY;
			public void mousePressed(MouseEvent e)
			{
				orgX=e.getX();
				orgY=e.getY();
			}
			public void mouseReleased(MouseEvent e)
			{
				Graphics g=f.getGraphics();
				g.setColor(Color.BLUE);
//			    f.getGraphics().setColor(Color.red);
				g.setFont(new Font("隶书",Font.ITALIC|Font.BOLD,30));
				g.drawString(new String(orgX+",隶书"+orgY),orgX,orgY);
				g.setFont(new Font("宋体",Font.ITALIC,15));	
			    g.setColor(Color.RED);
				g.drawString(new String(e.getX()+", 宋体"+e.getY()),e.getX(),e.getY());
				g.drawLine(orgX,orgY,e.getX(),e.getY());
	//			f.getGraphics().drawLine(orgX,orgY,e.getX(),e.getY());
			}
		});
	}
}
	