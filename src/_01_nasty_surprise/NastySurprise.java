package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Trick");
	JButton button2 = new JButton("Treat");
public static void main(String[] args) {
	NastySurprise ns = new NastySurprise();
	ns.setup();
}
void setup() {
	frame.setVisible(true);
	button1.addActionListener(this);
	button2.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	frame.pack();
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(button1)==true) {
		showPictureFromTheInternet("https://i.redd.it/dltqk6q2w0oz.jpg");
	}
	if(e.getSource().equals(button2)==true) {
		showPictureFromTheInternet("https://cdn2.bigcommerce.com/server2800/677b8/products/37430/images/111603/31215f_artwork__00025.1473448486.1100.1100.jpg?c=2");
	}
}
}
