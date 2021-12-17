package day48;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mouse extends JFrame{
	JPanel Jp = new JPanel();
	JLabel la;
	Mouse(){
		setTitle("mouse �̺�Ʈ â");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(Jp);
		Jp.addMouseListener(new MouseListener1());
		Jp.addMouseMotionListener(new MouseListener1());
		la = new JLabel("���콺�� �÷�������!");
		Jp.add(la);
		setSize(300, 300);
		setVisible(true);
	}
	
	
	class MouseListener1 implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("Mouse Dragged("+getX()+","+e.getY()+")");
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("Mouse Moved("+getX()+","+e.getY()+")");
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText("���욿 Ŭ��Ƚ��:"+e.getClickCount());
		}
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.RED);//���� ����� ����� ����
		}
		@Override
		public void mouseExited(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.YELLOW);//���� ����� ���ο�� ����
		}}
	
	
	public static void main(String[] args) {
		new Mouse();
	}
}