package prob3;

import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frm = new MyJFrame("ch25-1 <Problem 3>");
		
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
