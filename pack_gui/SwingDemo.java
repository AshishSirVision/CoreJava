package pack_gui;



import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo {
	public static void main(String[] args) {
	JFrame f=new JFrame();//create object of frame class
		
		//create component
		JButton b1=new JButton("+");
		JButton b2=new JButton("-");
		JButton b3=new JButton("*");
		JButton b4=new JButton("/");
		JLabel l1=new JLabel("Num1");
		JLabel l2=new JLabel("Num2");
		JLabel l3=new JLabel("Result");
		
		JTextField t1=new JTextField(20);
		JTextField t2=new JTextField(20);
		JTextField t3=new JTextField(20);
		
		//add component inside frame
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
		
		
		f.setLayout(new FlowLayout());
		f.setSize(150,160);
		f.setVisible(true);
		
	}
}
