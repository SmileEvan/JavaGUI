import java.awt.*;
public class TestFlowLayout {

	public static void main(String[] args) {
		Frame f=new Frame("���ֹ�����");
		//f.setLayout(new FlowLayout(FlowLayout.RIGHT));
     	f.setLayout(new FlowLayout(FlowLayout.LEFT, 50,100));
	   
		f.add(new Button("��һ����ť"));
		f.add(new Button("�ڶ�����ť"));
		f.add(new Button("��������ť"));
		f.add(new Button("���ĸ���ť"));
		f.setSize(300,300);
		f.setVisible(true);
	}
}