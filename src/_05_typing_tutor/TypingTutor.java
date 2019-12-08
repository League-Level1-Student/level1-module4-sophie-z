package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JFrame frame = new JFrame("TYPE OR DIE");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	void setup() {
		currentLetter = generateRandomLetter();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(label.CENTER);
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.pack();
}
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.setup();
	}
	char generateRandomLetter(){
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("YOU TYPED: " + e.getKeyChar());
		if(e.getKeyChar()==currentLetter) {
			System.out.println("CORRECT");
			panel.setBackground(Color.GREEN);
		}
		else {
			panel.setBackground(Color.RED);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	}
}