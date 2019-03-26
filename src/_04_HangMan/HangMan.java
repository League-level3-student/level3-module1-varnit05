package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
	String wordNum = JOptionPane.showInputDialog("type a number in between 1-266");
	int word = Integer.parseInt(wordNum);
	// for(int i = 0;)

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
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

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
