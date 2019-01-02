import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class GUI_Search_Delete extends JFrame {
	public GUI_Search_Delete(String str) {
		super(str);
		setBounds(600, 170, 330, 450);
		setLayout(new BorderLayout());
		
		// search ÆÇ³Ú 1	
		JPanel search_Panel = new JPanel();						
		Border search_Border = BorderFactory.createEtchedBorder();
		search_Border = BorderFactory.createTitledBorder(search_Border, "Search");
		
		search_Panel.setLayout(new FlowLayout());
		search_Panel.setBorder(search_Border);
		
		JTextField searchText = new JTextField(15);
		JButton searchButton = new JButton("SEARCH");
		// search ÆÇ³Ú 1
		
		// information ÆÇ³Ú 2
		JPanel information_Panel = new JPanel();					
		Border information_Border = BorderFactory.createEtchedBorder();
		information_Border = BorderFactory.createTitledBorder(information_Border, "Information Board");
		
		information_Panel.setLayout(new BorderLayout());
		information_Panel.setBorder(information_Border);
		
		JTextArea informationArea = new JTextArea(20, 25);
		informationArea.append("Ã£À¸½Ã´Â Á¤º¸¸¦ ¾Ë·Áµå¸³´Ï´Ù.\n");
		informationArea.setCaretPosition(informationArea.getText().length());
		
		informationArea.setLineWrap(true);
		informationArea.setWrapStyleWord(true);

		JScrollPane informationScroll = new JScrollPane(informationArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		information_Panel.add(informationScroll, BorderLayout.CENTER);
		// information ÆÇ³Ú 2
		
		// delete ÆÇ³Ú 3
		JPanel delete_Panel = new JPanel();
		Border delete_Border = BorderFactory.createEtchedBorder();
		delete_Border = BorderFactory.createTitledBorder(delete_Border, "Delete");
		
		delete_Panel.setLayout(new FlowLayout());
		delete_Panel.setBorder(delete_Border);
		
		JTextField deleteText = new JTextField(15);
		JButton deleteButton = new JButton("DEL");
		// delete ÆÇ³Ú 3		
		
		searchText.addActionListener(new SearchEventHandler(searchText, informationArea));
		searchButton.addActionListener(new SearchEventHandler(searchText, informationArea));
		search_Panel.add(searchText);
		search_Panel.add(searchButton);
		
		deleteText.addActionListener(new DeleteEventHandler(deleteText, informationArea));
		deleteButton.addActionListener(new DeleteEventHandler(deleteText, informationArea));
		delete_Panel.add(deleteText);
		delete_Panel.add(deleteButton);
		
		
		add(search_Panel, BorderLayout.NORTH);
		add(information_Panel, BorderLayout.CENTER);
		add(delete_Panel, BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
