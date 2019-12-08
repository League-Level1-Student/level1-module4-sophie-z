package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton one = new JButton("JOKE");
	JButton two = new JButton("PUNCHLINE");
public static void main(String[] args) {
	ChuckleClicker cc = new ChuckleClicker();
	cc.makeButtons();
}

void makeButtons() {
	frame.setVisible(true);
	panel.add(one);
	panel.add(two);
	one.addActionListener(this);
	two.addActionListener(this);
	frame.add(panel);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==one) {
		System.out.println("Why does Waldo wear stripes?");
	}
	if(e.getSource()==two) {
		System.out.println("Because he doesn't want to be spotted.");
	}
}
}
