/*import java.awt.*;
import javax.swing.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	 //String->Title
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		f1.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton btAdd = new JButton("Add");
		JButton btDelete = new JButton("Delete");
		JButton btUpdate = new JButton("Update");
		JButton btView = new JButton("View");
		
		btAdd.setFont(new Font("",1,30));
		f1.add(btAdd);

		btDelete.setFont(new Font("",1,30));
		f1.add(btDelete);

		btUpdate.setFont(new Font("",1,30));
		f1.add(btUpdate);

		btView.setFont(new Font("",1,30));
		f1.add(btView);
		
		f1.setVisible(true);
		
		
		//JButton[] btArray = new JButton[5];
		//String[] buttonText = {"North","East","South","West","Center"};
		
		//for(int i=0; i<5; i++){
		//	btArray[i] = new JButton(buttonText[i]);
		//	btArray[i].setSize(300,400);
		//	btArray[i].setFont(new Font("",2,30));

		//	f1.add(buttonText[i],btArray[i]);
			
		//}
		//f1.pack();
		//f1.setVisible(true);
	}
}*/


//import javax.swing.*;
//import java.awt.*;

/*class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("BorderLayout");	
		JFrame f2=new JFrame("FlowLayout");	
		f1.setSize(300,300);
		f2.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f2.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		f1.setLayout(new BorderLayout());//->Default BorderLayout
		f2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JTextField txtBorderLayout=new JTextField(5);
		JTextField txtFlowLayout=new JTextField(5);
		
		txtBorderLayout.setFont(new Font("",1,30));
		txtFlowLayout.setFont(new Font("",1,30));
		
		f1.add("North",txtBorderLayout);
		f1.add("South",new JButton("Test"));
		
		f2.add(txtFlowLayout);
		
		f1.setVisible(true);
		f2.setVisible(true);
	}
}*/

/*import javax.swing.*;
import java.awt.*;

class Demo{
	public static void main(String[] args){
		JFrame f1 = new JFrame("BorderLayout");
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		f1.setLayout(new GridLayout(3,2));
		JButton[] btArray = new JButton[6];
		String[] buttonText = {"Add","Delete","Update","Read","Cancle","Exit"};
		
		for(int i=0; i<6; i++){
			btArray[i] = new JButton(buttonText[i]);
			btArray[i].setFont(new Font("",1,30));
			f1.add(buttonText[i],btArray[i]);
		}
		f1.setVisible(true);
	}
}*/

/*import java.awt.*;
import javax.swing.*;
class Demo{
	public static void main(String[] args){
		JFrame f1 = new JFrame("Shenal");
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton btNorth = new JButton("North");
		JButton btSouth = new JButton("South");
		JButton btEast = new JButton("East");
		JButton btWest = new JButton("West");
		JPanel CenterPanel = new JPanel();
		
		CenterPanel.setLayout(new GridLayout(2,2));
		
		btNorth.setFont(new Font("",1,30));
		btEast.setFont(new Font("",1,30));
		btSouth.setFont(new Font("",1,30));
		btWest.setFont(new Font("",1,30));
		
		f1.add("North",btNorth);
		f1.add("East",btEast);
		f1.add("South",btSouth);
		f1.add("West",btWest);
		f1.add("Center",CenterPanel);
		
		
		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		JButton bt3 = new JButton("3");
		JButton bt4 = new JButton("4");
		
		bt1.setFont(new Font("",1,30));
		bt2.setFont(new Font("",1,30));
		bt3.setFont(new Font("",1,30));
		bt4.setFont(new Font("",1,30));
		
		CenterPanel.add("1",bt1);
		CenterPanel.add("2",bt2);
		CenterPanel.add("3",bt3);
		CenterPanel.add("4",bt4);
		
		f1.pack();
		f1.setVisible(true);
	}
}*/

/*import java.awt.*;
import javax.swing.*;

class Demo{
	public static void main(String[] args){
				
		JFrame f1 = new JFrame("Calculator");
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTextField TxtDisplay = new JTextField();
		TxtDisplay.setFont(new Font("",1,30));
		f1.add("North",TxtDisplay);
		
		JPanel Btn = new JPanel();
		Btn.setLayout(new GridLayout(4,4));
		
		JButton[] btArray = new JButton[16];
		String[] buttonText = {"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-",};
		
		for(int i=0; i<16; i++){
			btArray[i] = new JButton(buttonText[i]);
			btArray[i].setFont(new Font("",1,30));
			Btn.add(buttonText[i],btArray[i]);
		}
		f1.add("Center",Btn);
		
		f1.setVisible(true);
	}
}*/

import java.awt.*;
import javax.swing.*;

class Calculator extends JFrame{
	Calculator(String title){
		setTitle("Calculator");
	}
}
class Demo{
	public static void main(String[] args){
		JFrame f1 = new JFrame("JFrame");
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Calculator c1 = new Calculator("Calculator");
		c1.setSize(300,300);
		c1.setLocationRelativeTo(null);
		c1.setDefaultCloseOperation(Calculator.DISPOSE_ON_CLOSE);
		
		f1.setVisible(true);
		c1.setVisible(true);
	}
}
