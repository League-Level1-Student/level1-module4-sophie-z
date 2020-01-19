package _13_online_practice_quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel("How many seconds are there in one year?");
JButton button1 = new JButton("Hint");
JButton button2 = new JButton("Submit");
JTextField tf = new JTextField(10);

void setup() {
	frame.setVisible(true);
	panel.add(label);
	button1.addActionListener(this);
	button2.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	panel.add(tf);
	frame.add(panel);
	frame.pack();
}

public static void main(String[] args) {
	PracticeTest pt = new PracticeTest();
	pt.setup();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String submitted = tf.getText();
	if(submitted.equals("12")) {
		JOptionPane.showMessageDialog(null, "Congratulations. You answered the riddle correctly.");
	}
	else {
		JOptionPane.showMessageDialog(null, "WRONG!");
	}
	if(e.getSource()==button1) {
		JOptionPane.showMessageDialog(null, "There is one per each month.");
	}
	
}
}
