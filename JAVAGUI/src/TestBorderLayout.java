import java.awt.*;
public class TestBorderLayout {

	public static void main(String[] args) {
		Frame f=new Frame("���ֹ�����");
		f.add(new Button("��һ����ť"), BorderLayout.EAST);
		f.add(new Button("�ڶ�����ť"), BorderLayout.WEST);
		f.add(new Button("��������ť"));
		f.add(new Button("���ĸ���ť"),BorderLayout.SOUTH);
		f.add(new Button("��5����ť"),BorderLayout.NORTH);
		f.setSize(300,300);
		f.setVisible(true);
	}
}

