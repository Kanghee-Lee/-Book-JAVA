package prob1;

import java.awt.event.*;
import javax.swing.*;

public class MouseEventHandler extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		JButton button = (JButton)e.getComponent();
		button.setText("Clikced");
		System.out.println("Clicked Button" + e.getButton());
		System.out.println("���콺 ��ư ���ȴ� Ǯ��");
	}
}
