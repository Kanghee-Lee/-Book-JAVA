package prob2;

import java.awt.event.*;

public class FrameMouseEventHandler extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		System.out.println("JFrame상에서 마우스 버튼 눌렸다 풀림");
	}
}