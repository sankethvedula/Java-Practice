import java.awt.*;
import javax.swing.*;
import java.awt.Label.*;
import java.awt.event.*;
class Employee extends Frame implements ActionListener{
	Label lbl1,lbl2,lbl3,lbl4,lbl5;
	TextField tf1,tf2,tf3,tf4,tf5;
	Button b1,b2;
	TextArea ta1;
Employee(){
	this.setLayout(new FlowLayout());
	lbl1 = new Label("Employee Name:",Label.LEFT);//Fuck! LEFT is a static constant Why am I so retard! 
	lbl2 = new Label("Employee ID:",Label.LEFT);
	lbl3 = new Label("Employee Salary:",Label.LEFT);
	lbl4 = new Label("Employee Joining Date:",Label.LEFT);
	lbl5 = new Label("Employee's DOB:",Label.LEFT);
	tf1 = new TextField("",20);
	tf2 = new TextField("",20);
	tf3 = new TextField("",20);
	tf4 = new TextField("",20);
	tf5 = new TextField("",20);
	b1 = new Button("Submit");
	b2 = new Button("Cancel");
	ta1 = new TextArea(10,20);
	this.add(lbl1);
	this.add(tf1);
	this.add(lbl2);
	this.add(tf2);
	this.add(lbl3);
	this.add(tf3);
	this.add(lbl4);
	this.add(tf4);
	this.add(lbl5);
	this.add(tf5);
	this.add(b1);
	this.add(b2);
	this.add(ta1);
	b1.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
	String s1 = tf1.getText();
	ta1.setText("Employee Name:"+s1);
	
}
public static void main(String []args){
 Employee e1 = new Employee();
 e1.setSize(400,400);
 e1.setVisible(true);
 e1.addWindowListener(new WindowAdapter()
 	{public void windowClosing(WindowEvent e)
 	{
 		System.exit(0);
 	}

	}
 	);
}
}