//TestFrame.java
/*
import java.awt.*;
import java.awt.event.*;
public class testFrame3
{
	public static void main(String[] args)
	{
	    Button btn = new Button("OK");
	    Frame f=new Frame("Test for Frame");
		f.add(btn);

		f.addWindowListener(new MyWindowListener());
		f.setSize(300,300);
	    f.setVisible(true);
	    
	    
	}
	
}

class MyWindowListener implements WindowListener {

 public void windowActivated(WindowEvent e) {
       System.out.println("Windown is activeated.");
 }
      // �� Window ����Ϊ� Window ʱ���á� 
 public void windowClosed(WindowEvent e){
      System.out.println("Window is closed.");

 } 
         // ��Դ��ڵ��� dispose ������ر�ʱ���á� 
 public void windowClosing(WindowEvent e){
 	  System.out.println("Windown is closing");
 	  e.getWindow().setVisible(false);
      ((Window)e.getComponent()).dispose();
      System.exit(0);

 } 
         // �û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ���á� 
 public void windowDeactivated(WindowEvent e) {
     System.out.println("Windown is closed"); 
     
 }
          //�� Window �����ǻ Window ʱ���á� 
 public void windowDeiconified(WindowEvent e){
 	System.out.println("Window is deiconfied.\n");
 } 
          //���ڴ���С��״̬��Ϊ����״̬ʱ���á� 
 public void windowIconified(WindowEvent e){
 	System.out.println("Window is iconfied.\n");
 } 
    //      ���ڴ�����״̬��Ϊ��С��״̬ʱ���á� 
 public void windowOpened(WindowEvent e){
 	System.out.println("Window is opened.\n");
 } 
 

	
}*/