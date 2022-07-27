package pack_gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWTDemo {
	public static void main(String[] args) {
		Frame f=new Frame();//create object of frame class
		
		//create component
		Button b1=new Button("+");
		Button b2=new Button("-");
		Button b3=new Button("*");
		Button b4=new Button("/");
		Label l1=new Label("Num1");
		Label l2=new Label("Num2");
		
		TextField t1=new TextField(20);
		TextField t2=new TextField(20);
		
		//add component inside frame
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		f.setLayout(new FlowLayout());
		f.setSize(150,160);
		f.setVisible(true);
		
	}
}
