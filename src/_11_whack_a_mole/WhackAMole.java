package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

void drawButtons(int number) {
	for(int i = 0; i<24; i++) {
		JButton button = new JButton();
		p.add(button);
		button.addActionListener(this);
		if(i == number) {
			JButton mole = new JButton("MOLE!");
		}
	}
}
	
JFrame f = new JFrame("Whack a Button for Fame and Glory");
JPanel p = new JPanel();

void setup() {
	f.setVisible(true);
	f.setSize(500, 500);
	}

 public static void main(String[] args) {
	WhackAMole wam = new WhackAMole();
	Random r = new Random();
	int integer = r.nextInt(24);
	wam.drawButtons(integer);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
 }
