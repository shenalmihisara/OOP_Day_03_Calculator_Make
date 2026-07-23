import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	 //String->Title
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton[] btArray = new JButton[5];
		String[] buttonText = {"North","East","South","West","Center"};
		
		for(int i=0; i<5; i++){
			btArray[i] = new JButton(buttonText[i]);
			btArray[i].setSize(300,400);
			btArray[i].setFont(new Font("",2,30));

			f1.add(buttonText[i],btArray[i]);
			
		}
		f1.pack();
		f1.setVisible(true);

		//JButton b1 = new JButton();
		//JButton b2 = new JButton();
		//JButton b3 = new JButton();
		//JButton b4 = new JButton();
		//JButton b5 = new JButton();
		
		/*b1.setText("North");
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
		f1.add("Center",b5);*/
	}
}
