import java.awt.event.*;
import javax.swing.*;


public class DeleteEventHandler implements ActionListener {
	JTextField deleteText;
	JTextArea informArea;
	
	public DeleteEventHandler(JTextField dT, JTextArea iA) {
		this.deleteText = dT;
		this.informArea = iA;
	}
	
	public void actionPerformed(ActionEvent e) {
		PhoneBookManager manager = PhoneBookManager.createPhoneBookManager();
		informArea.append(manager.delete(deleteText.getText()));
		deleteText.setText(null);
	}
}
