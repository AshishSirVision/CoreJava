package pack_gui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo5 extends JFrame{//inherit all features of jframe
	
	public SwingDemo5() {
	
		// create component
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		JLabel l1 = new JLabel("Num1");
		JLabel l2 = new JLabel("Num2");
		JLabel l3 = new JLabel("Result");

		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);

		// add component inside frame
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);

		add(b1);
		add(b2);
		add(b3);
		add(b4);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(t2.getText());
				int c = a + b;
				t3.setText(String.valueOf(c));
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(t2.getText());
				int c = a / b;
				t3.setText(String.valueOf(c));
			}
		});

		setLayout(new FlowLayout());
		setSize(150, 160);
		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingDemo5();
	}
}
