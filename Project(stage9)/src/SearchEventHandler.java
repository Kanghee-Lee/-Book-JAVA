import java.awt.event.*;
import javax.swing.*;


public class SearchEventHandler implements ActionListener {
	JTextField srchText;
	JTextArea informArea;
	
	public SearchEventHandler(JTextField sT, JTextArea iA) {
		this.srchText = sT;
		this.informArea = iA;
	}
	
	public void actionPerformed(ActionEvent e) {
		PhoneBookManager manager = PhoneBookManager.createPhoneBookManager();
		informArea.append(manager.search(srchText.getText()));
		srchText.setText(null);
	}
}
