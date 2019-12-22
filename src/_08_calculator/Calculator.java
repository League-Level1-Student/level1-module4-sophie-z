package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame f = new JFrame("Simple Calculator");
	JPanel p = new JPanel();
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton b1 = new JButton("add");
	JButton b2 = new JButton("subtract");
	JButton b3 = new JButton("multiply");
	JButton b4 = new JButton("divide");
	JLabel l = new JLabel();
	
int add(int number1, int number2) {
	int sum = number1+number2;
	return sum;
}

int multiply(int number1, int number2){
	int product = number1*number2;
	return product;
}

int subtract(int number1, int number2) {
	int difference = number1-number2;
	return difference;
}

int divide(int number1, int number2) {
	int quotient = number1/number2;
	return quotient;
}

void setup() {
	f.setVisible(true);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	p.add(l);
	p.add(tf1);
	p.add(tf2);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	f.add(p);
	f.pack();
}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.setup();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String tone = tf1.getText();
	int t1 = Integer.parseInt(tone);
	String ttwo = tf2.getText();
	int t2 = Integer.parseInt(ttwo);
	if(e.getSource()==b1) {
		int s = add(t1, t2);
		l.setText("" + s);
	}
	if(e.getSource()==b2) {
		int d = subtract(t1, t2);
		l.setText("" + d);
	}
	if(e.getSource()==b3) {
		int p = multiply(t1, t2);
		l.setText("" + p);
	}
	if(e.getSource()==b4) {
		int q = divide(t1, t2);
		l.setText("" + q);
	}
	
}
}
