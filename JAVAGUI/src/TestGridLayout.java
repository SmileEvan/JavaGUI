import java.awt.*;
public class TestGridLayout {

	public static void main(String[] args) {
		Frame f=new Frame("���ֹ�����");
		f.setLayout(new GridLayout(2,2,10,20));
		f.add(new Button("��һ����ť"));
		f.add(new Button("�ڶ�����ť"));
		f.add(new Button("��������ť"));
		f.add(new Button("���ĸ���ť"));
		f.setSize(300,300);
		f.setVisible(true);
	}
}