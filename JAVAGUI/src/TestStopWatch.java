import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.SimpleDateFormat;
class StopWatch extends Canvas implements Runnable
{
	private long startTime=0;
	private long endTime=0;
	private boolean bStart=false;
	public StopWatch()
	{
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		setSize(180,130);
	}
	protected void processMouseEvent(MouseEvent e)
	{
		if(e.getID()==MouseEvent.MOUSE_PRESSED)
		{
			bStart=true;
			startTime=endTime=System.currentTimeMillis();
			repaint();
			new Thread(this).start();
		}
		else if(e.getID()==MouseEvent.MOUSE_RELEASED)
		{
			bStart=false;
			repaint();
		}
		super.processMouseEvent(e);
	}
	public void paint(Graphics g)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		Date elapsedTime=null;
		try
		{
			elapsedTime=sdf.parse("00:00:00");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		elapsedTime.setTime(endTime-startTime+elapsedTime.getTime());
		String display=sdf.format(elapsedTime);
		g.setFont(new Font("����",Font.ITALIC|Font.BOLD,18));
		g.drawRect(0,0,88,28);
		g.fill3DRect(2,2,85,25,true);
		
		g.setColor(Color.RED);
		g.drawString(display,10,20);
	}
	public void run()
	{
		while(bStart)
		{
			try
			{
				Thread.sleep(500);
			}catch(Exception e){e.printStackTrace();}
			endTime=System.currentTimeMillis();
			repaint();
		}
	}
}
public class TestStopWatch {
	public static void main(String[] args) {
		Frame f=new Frame("StopWatch");
		f.add(new StopWatch());
		f.setSize(200,200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}
