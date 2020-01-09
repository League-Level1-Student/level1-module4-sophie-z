package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

void drawButtons(int number) {
	for(int i = 0; i<24; i++) {
		if(i == number) {
			JButton mole = new JButton("    MOLE!    ");
			mole.addActionListener(this);
			p.add(mole);
		}
		else {
			JButton button = new JButton("NOT MOLES");
			p.add(button);
			button.addActionListener(this);
		}
	}
}
	
Date timeatstart = new Date();
int moleswhacked = 0;
int molesmissed = 0;
JFrame f = new JFrame("Whack a Button for Fame and Glory");
JPanel p = new JPanel();

void setup() {
	f.add(p);
	p.setPreferredSize(new Dimension(500, 500));
	f.setVisible(true);
	f.setSize(500, 500);
	}

 public static void main(String[] args) {
	WhackAMole wam = new WhackAMole();
	Random r = new Random();
	int integer = r.nextInt(24);
	wam.drawButtons(integer);
	wam.setup();
}

 void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
 
 private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
 
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b = (JButton) e.getSource();
	
	if(b.getText().equals("    MOLE!    ")) {
		moleswhacked = moleswhacked + 1;
	}
	
	else if(b.getText().equals("NOT MOLES")) {
		speak("CONGRATULATIONS. YOU MISSED.");
	}
	
	f.remove(p);
	p = new JPanel();
	setup();
	Random r = new Random();
	drawButtons(r.nextInt(24));
	f.pack();

	if(moleswhacked==10) {
		endGame(timeatstart, 10);
	}
	
	if(b.getText().equals("NOT MOLES")) {
		molesmissed = molesmissed + 1;
	}
	
	if(molesmissed==5) {
		JOptionPane.showMessageDialog(null, "YOU LOST.");
	}
}
 }