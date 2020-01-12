package _12_slot_machine;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
JFrame frame = new JFrame("THE ULTIMATE SLOT MACHINE");
JPanel panel = new JPanel();
JLabel label1 = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
JButton button = new JButton("SPIN TO WIN");
int random1;
int random2;
int random3;

void setup() {
	random1 = new Random().nextInt(3);
	random2 = new Random().nextInt(3);
	random3 = new Random().nextInt(3);
	frame.setVisible(true);
	label1.setVisible(true);
	label2.setVisible(true);
	label3.setVisible(true);
	button.addActionListener(this);
	panel.add(button);
	frame.add(panel);
	frame.setSize(900, 600);
	
	if(random1==0) {
		try {
			label2 = createLabelImage("smcat.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else if(random1==1) {
		try {
			label2 = createLabelImage("smdog.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else {
		try {
			label2 = createLabelImage("smhamster.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	if(random2==0) {
		try {
			label1 = createLabelImage("smcat.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else if(random2==1) {
		try {
			label1 = createLabelImage("smdog.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else {
		try {
			label1 = createLabelImage("smhamster.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	if(random3==0) {
		try {
			label3 = createLabelImage("smcat.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else if(random3==1) {
		try {
			label3 = createLabelImage("smdog.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else {
		try {
			label3 = createLabelImage("smhamster.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	frame.pack();
	System.out.println(random1);
	System.out.println(random2);
	System.out.println(random3);
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

void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		frame.remove(panel);
		panel = new JPanel();
		button.removeActionListener(this);
		setup();
		frame.pack();
	}

	if(random1==0 && random2==0 && random3==0) {
		speak("YOU WON.");
		JOptionPane.showMessageDialog(null, "YOU WIN.");
	}
	else if(random1==1 && random2==1 && random3==1) {
		speak("YOU WON.");
		JOptionPane.showMessageDialog(null, "YOU WIN.");
	}
	else if(random1==2 && random2==2 && random3==2) {
		speak("YOU WON.");
		JOptionPane.showMessageDialog(null, "YOU WIN.");
	}
}
}
