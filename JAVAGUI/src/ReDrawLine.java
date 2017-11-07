import java.awt.*;
import java.awt.event.*;
public class ReDrawLine extends Frame
{
	int orgX;
	int orgY;
	int endX;
	int endY;
	
	public static void main(String[] args)
	{
		new ReDrawLine().init();
	}
	//����Component��paint����
	public void paint(Graphics g)
	{
		System.out.println("paint is called");
        g.setColor(Color.RED);
		g.setFont(new Font("����",Font.ITALIC|Font.BOLD,30));
		g.drawString(new String(orgX+",����"+orgY),orgX,orgY);
		g.setFont(new Font("����",Font.ITALIC,30));
		g.drawString(new String(endX+",����"+endY),endX,endY); 
		g.drawLine(orgX,orgY,endX,endY);
	}
	public void init()
	{   
        this.setTitle("ReDrawLine");	
		this.setSize(300,300);
		this.setVisible(true);
		
		
	
		this.addMouseListener(new MouseAdapter()
		{
			
			public void mousePressed(MouseEvent e)
			{
				orgX=e.getX();
				orgY=e.getY();
			}
			public void mouseReleased(MouseEvent e)
			{
				endX=e.getX();
				endY=e.getY();
				Graphics g=e.getComponent().getGraphics();
				g.setColor(Color.red);
				g.setFont(new Font("����",Font.ITALIC|Font.BOLD,30));
				g.drawString(new String(orgX+","+orgY),orgX,orgY);
				g.drawString(new String(e.getX()+","+e.getY()),e.getX(),e.getY());
				g.drawLine(orgX,orgY,e.getX(),e.getY());
			}
		});
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				((Window)e.getSource()).dispose();
				System.exit(0);
			}
		});
	}
}
	