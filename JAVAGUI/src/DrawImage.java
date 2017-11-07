import java.awt.*;
import java.awt.event.*;
public class DrawImage extends Frame
{
	Image img=null;
	static int i=0;
	public static void main(String[] args)
	{
		//sth new
		//sth new
		DrawImage f=new DrawImage();
		f.init();
	}
	public void init()
	{
		     
 
		setSize(600,400);
		setTitle("DrawImage");	
					
       	img=this.getToolkit().getImage("d:\\javakejian\\xmas.jpg");

///     this.getGraphics().drawImage(img,0,100,this);      	
		setVisible(true);


//		img=this.getToolkit().getImage("d:\\javakejian\\xmas.jpg");       
        this.setIconImage(img);
        
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
	}

	public void paint(Graphics g)
	{        
		
		System.out.println("paint() is called "+ i++);
        this.getGraphics().drawImage(img,100,100,this);
	}

}
