package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	Stack<String> randomStack = new Stack<String>();
	String popped;
	String blanks;
	int lives = 10;
	ArrayList<Character> wrong = new ArrayList<Character>();
	

	public static void main(String[] args) {
		new HangMan().createUI();
	}

	void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();

		frame.add(panel);
		panel.add(label);

		frame.addKeyListener((KeyListener) this);
		frame.setSize(2000, 2000);
		frame.setVisible(true);
		frame.pack();

		String wordNum = JOptionPane.showInputDialog("type a number in between 1-266");
		int word = Integer.parseInt(wordNum);

		for (int i = word; i > 0; i--) {
			randomStack.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		popped = randomStack.pop();

		blanks = "";

		for (int i = 0; i < popped.length(); i++) {
			blanks += "_";

		}
		label.setText(blanks);
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder(label.getText());
		boolean found = false;
		for (int i = 0; i < popped.length(); i++) {

			if (e.getKeyChar() == popped.charAt(i)) {
				sb.setCharAt(i, e.getKeyChar());
				found=true;
			}
			

			
		}
		if(!found) {


				wrong.add(e.getKeyChar());
				lives -= 1;
				JOptionPane.showMessageDialog(null,"You have" + lives + "lives" + "left ");
		
		}
		if (lives == 0) {
			JOptionPane.showMessageDialog(null, "Game over");
			
			
		}
		label.setText(sb.toString());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
