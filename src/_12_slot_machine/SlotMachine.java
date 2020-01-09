package _12_slot_machine;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame("ThE UlTiMaTe SlOt MaChInE");
JPanel panel = new JPanel();
JLabel label1 = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
JButton button = new JButton("SPIN TO WIN");
Random random = new Random(2);

void setup() {
	frame.setVisible(true);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	button.addActionListener(this);
	panel.add(button);
	frame.add(panel);
	frame.setSize(800, 500);
	if(random.equals(0)) {
		
	}
	else if(random.equals(1)) {
		
	}
	else {
		
	}
}

public static void main(String[] args) {
	SlotMachine sm = new SlotMachine();
	sm.setup();
}

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image" + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
