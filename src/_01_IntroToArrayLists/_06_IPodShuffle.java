package _01_IntroToArrayLists;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle {
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		Song s = new Song("demo.mp3");
		s.play();

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 * 
		 */

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton but = new JButton();
		new _06_IPodShuffle();
		ArrayList<Song> sickbeats = new ArrayList<Song>();
		frame.add(but);
		frame.setSize(800, 800);
		but.setText("Suprise Me !");
		frame.setVisible(true);
		frame.pack();

	}
}