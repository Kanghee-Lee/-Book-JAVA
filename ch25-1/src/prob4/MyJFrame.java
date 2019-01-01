package prob4;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyJFrame extends JFrame implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5120848378392549595L;

	public MyJFrame(String str) {
		super(str);
		setBounds(120, 120, 400, 100);
		setLayout(new FlowLayout());
		addMouseListener(this);
		
		JButton btn1 = new JButton("First Button");
		JButton btn2 = new JButton("Second Button");
		JButton btn3 = new JButton("Third Button");
		
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		btn2.addMouseListener(listener);
		btn3.addMouseListener(listener);
		
		add(btn1);
		add(btn2);
		add(btn3);
	}

	
	
	
	
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("JFrame상에서 마우스 버튼 눌렸다 풀림");
	}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
}