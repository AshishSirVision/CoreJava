package pack_gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();// create object of frame class

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
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				int a=Integer.parseInt(s1);
				int b=Integer.parseInt(t2.getText());
				int c=a+b;
				t3.setText(String.valueOf(c));
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				int a=Integer.parseInt(s1);
				int b=Integer.parseInt(t2.getText());
				int c=a/b;
				t3.setText(String.valueOf(c));
			}
		});

		f.setLayout(new FlowLayout());
		f.setSize(150, 160);
		f.setVisible(true);

	}
}
