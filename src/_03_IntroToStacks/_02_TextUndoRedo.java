package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.xml.stream.events.Characters;

public class _02_TextUndoRedo implements KeyListener {
	  JFrame frame; 
	  JPanel panel; 
	  JLabel label; 
	Stack<Character> stack = new Stack<Character>();
	public static void main(String[] args) {
			new _02_TextUndoRedo().createUI();
		}
	
	/* 
	 * Create a JFrame with a JPanel and a JLabel.

	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	

	  
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
	 
		// if  {
			
		
		 
		 
		  
	  }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
			
		}
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		String t = label.getText(); 	
		label.setText(t + e.getKeyChar());
		
		if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			stack.push(t.charAt(t.length()-1));
			label.setText(t.substring(0, t.length()-1));
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) { 
		
	}
}

