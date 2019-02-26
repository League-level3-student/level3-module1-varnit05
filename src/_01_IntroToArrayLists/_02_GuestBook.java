package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton but1;
	JButton but2;
	ArrayList<String> name = new ArrayList<String>();
	
	
	void createUi() {
		frame = new JFrame();
		panel = new JPanel();
		but1 = new JButton();
		but2 = new JButton();
		frame.add(panel);
		panel.add(but1);
		panel.add(but2);
		but1.setText("Add Names");
		but2.setText("View Names");
		frame.setVisible(true);
		frame.pack();
		but1.addActionListener(this);
		but2.addActionListener(this);
	
	}

	public static void main(String[] args) {

		new _02_GuestBook().createUi();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if (e.getSource() == but1) {
			String v = JOptionPane.showInputDialog("type a name");
			name.add(v);
			 
			 
		} else if (e.getSource() == but2) {
			String l = "";
			 for (int i = 0; i < name.size(); i++) {
				 int u = i + 1;
				 l += " guest #"+ (u) +" " + name.get(i) + "\n";
		

			 
		}
			 JOptionPane.showMessageDialog(null, l );
	}

}
}