import javax.swing.*;
import java.awt.*;
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
		
		
		/*JButton[] btArray = new JButton[5];
		String[] buttonText = {"North","East","South","West","Center"};
		
		for(int i=0; i<5; i++){
			btArray[i] = new JButton(buttonText[i]);
			btArray[i].setSize(300,400);
			btArray[i].setFont(new Font("",2,30));

			f1.add(buttonText[i],btArray[i]);
			
		}
		f1.pack();
		f1.setVisible(true);*/
	}
}
