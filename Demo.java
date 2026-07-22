import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	 //String->Title
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		
		b1.setText("North");
		b1.setFont(new Font("",1,30));
		f1.add("North",b1);

		b2.setText("East");
		b2.setFont(new Font("",1,30));
		f1.add("East",b2);

		b3.setText("South");
		b3.setFont(new Font("",1,30));
		f1.add("South",b3);

		b4.setText("West");
		b4.setFont(new Font("",1,30));
		f1.add("West",b4);

		b5.setText("Center");
		b5.setFont(new Font("",1,30));
		f1.add("Center",b5);

		f1.pack();
		f1.setVisible(true);
	}
}
