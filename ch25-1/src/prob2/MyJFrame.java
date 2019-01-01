package prob2;

import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7334772465494531981L;

	public MyJFrame(String str) {
		super(str);
		setBounds(120, 120, 400, 100);
		setLayout(new FlowLayout());
		addMouseListener(new FrameMouseEventHandler());
	}
}
