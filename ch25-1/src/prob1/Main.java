package prob1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frm = new JFrame("ch25-1 <Problem 1>");
		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());
		frm.addMouseListener(new FrameMouseEventHandler());
		
		JButton btn1 = new JButton("First Button");
		JButton btn2 = new JButton("Second Button");
		JButton btn3 = new JButton("Third Button");
		
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		btn2.addMouseListener(listener);
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}

}
