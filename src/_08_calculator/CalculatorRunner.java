package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner {
public static void main(String[] args) {
	Calculator c = new Calculator();
}
void setup() {
	JFrame f = new JFrame("Simple Calculator");
	JPanel p = new JPanel();
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JButton b1 = new JButton("add");
	JButton b2 = new JButton("subtract");
	JButton b3 = new JButton("multiply");
	JButton b4 = new JButton("divide");
	p.add(tf1);
	p.add(tf2);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	f.add(p);
	f.pack();
	
}
}
