package pack_gui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame {
	// Reference variable of swing Component
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JTextField t1;
	JTextArea ta;
	JRadioButton rb1;
	JRadioButton rb2;
	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;
	JCheckBox cb4;
	JComboBox cbox;
	JButton b1;

	public RegistrationForm() {

		createComponent();
		addComponent();
		setLayout(null);
		setVisible(true);
		setSize(500, 400);
		setTitle("Sign Up Form");
		Image icon = Toolkit.getDefaultToolkit().getImage("src/pack_gui/icon.png");
		// setBackground(Color.blue);
		setIconImage(icon);
	}

	void createComponent() {
		String cname[]= {"india","Sri lanka","England","Australia","South Africa"};
		l1 = new JLabel("First Name :");
		l2 = new JLabel("Gender:");
		l3 = new JLabel("Course :");
		l4 = new JLabel("Address :");
		l5 = new JLabel("Country :");
		t1 = new JTextField(20);
		ta = new JTextArea(5,20);
		rb1 = new JRadioButton();
		rb2 = new JRadioButton();
		cb1 = new JCheckBox();
		cb2 = new JCheckBox();
		cb3 = new JCheckBox();
		cb4 = new JCheckBox();
		cbox = new JComboBox(cname);
		b1 = new JButton("Click me");

	}

	void addComponent() {
		l1.setBounds(100, 100, 70, 20);
			t1.setBounds(l1.getX()+l1.getWidth()+20, 100, 120, 20);
		l2.setBounds(100, l1.getY()+l1.getHeight()+20, 70, 20);
			rb1.setBounds(l2.getX()+l2.getWidth()+20, l1.getY()+l1.getHeight()+20, 20, 20);
			rb2.setBounds(rb1.getX()+rb1.getWidth()+20, l1.getY()+l1.getHeight()+20, 20, 20);
		l3.setBounds( l2.getX(), l2.getY()+l2.getHeight()+20, l2.getWidth(), l2.getHeight());	
			cb1.setBounds(l3.getX()+l3.getWidth()+20, l2.getY()+l2.getHeight()+20, 20, 20);
			cb2.setBounds(cb1.getX()+cb1.getWidth()+20, l2.getY()+l2.getHeight()+20, 20, 20);
		
		add(l1);
			add(t1);
		add(l2);

		add(rb1);
		add(rb2);
		add(l3);

		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(l4);

		add(ta);
		add(l5);
	
		add(cbox);
		add(b1);
	}

	public static void main(String[] args) {
		new RegistrationForm();
	}
}
