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

/*import java.awt.*;
import javax.swing.*;

class Calculator extends JFrame{
	private JButton btNorth;
	
	Calculator(String title){
		setTitle("Calculator");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(Calculator.DISPOSE_ON_CLOSE);

		JButton btNorth=new JButton("North");
		btNorth.setFont(new Font("",1,30));
		add("North",btNorth);
	}
}
class Demo{
	public static void main(String[] args){

		Calculator c1 = new Calculator("Calculator");
		c1.setVisible(true);

		//c1.setSize(300,300);
		//c1.setLocationRelativeTo(null);
		//c1.setDefaultCloseOperation(Calculator.DISPOSE_ON_CLOSE);
		
		// JButton btNorth=new JButton("North");
		// btNorth.setFont(new Font("",1,30));
		// c1.add("North",btNorth);
	}
}*/

/*import java.awt.*;
import javax.swing.*;
class Calculator extends JFrame{
	private JTextField txtDisplay;
	private JPanel buttonPanel;
	
	Calculator(String title){
		
		setTitle("Calculator");
		setSize(300,350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTextField txtDisplay=new JTextField();
		txtDisplay.setFont(new Font("",1,25));	
		add("North",txtDisplay);
		
		JPanel buttonPanel=new JPanel(); 
		buttonPanel.setLayout(new GridLayout(4,4,3,3));
		JButton[] btArray=new JButton[16];
		String[] buttonText={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		for (int i = 0; i < 16; i++){
			btArray[i]=new JButton(buttonText[i]);
			btArray[i].setFont(new Font("",1,25));
			buttonPanel.add(buttonText[i],btArray[i]);
		}
		add("Center",buttonPanel);
	}
}
class Demo{
	public static void main(String args[]){
		Calculator c1=new Calculator("Calculator");	
		c1.setVisible(true);
	}
}*/

/*import java.awt.*;
import javax.swing.*;

class StudentForm extends JFrame{
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtDbms;
	private JTextField txtPrf;
	
	private JButton addBtn;
	private JButton cancleBtn;
	
	StudentForm(String title){
		setTitle("Student Form");
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(StudentForm.DISPOSE_ON_CLOSE);
		
		JLabel titleLabel=new JLabel("Add Student Form");
		titleLabel.setFont(new Font("",1,30));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton addBtn=new JButton("Add Student");
		JButton cancleBtn=new JButton("Cancle");
		addBtn.setFont(new Font("",1,15));
		cancleBtn.setFont(new Font("",1,15));
		buttonPanel.add(addBtn);
		buttonPanel.add(cancleBtn);
		add("South",buttonPanel);
		
		JPanel lablePanel=new JPanel();
		lablePanel.setLayout(new GridLayout(4,1));
		JLabel stId=new JLabel("Student ID -:");
		JLabel Name=new JLabel("Name -:");
		JLabel PRF=new JLabel("PRF Marks -:");
		JLabel DBMS=new JLabel("DBMS Marks -:");
		stId.setFont(new Font("",1,20));
		Name.setFont(new Font("",1,20));
		DBMS.setFont(new Font("",1,20));
		PRF.setFont(new Font("",1,20));
		lablePanel.add(stId);
		lablePanel.add(Name);
		lablePanel.add(PRF);
		lablePanel.add(DBMS);
		add("West",lablePanel);
		
		JPanel txtPanel=new JPanel();
		txtPanel.setLayout(new GridLayout(4,1));
		JTextField txtId=new JTextField(8);
		JTextField txtName=new JTextField(15);
		JTextField txtDbms=new JTextField(4);
		JTextField txtPrf=new JTextField(4);
		txtId.setSize(500,500);
		txtId.setFont(new Font("",1,20));
		txtName.setFont(new Font("",1,20));
		txtPrf.setFont(new Font("",1,20));
		txtDbms.setFont(new Font("",1,20));

		JPanel idTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idTxtPanel.add(txtId);
		txtPanel.add(idTxtPanel);

		JPanel nameTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTxtPanel.add(txtName);
		txtPanel.add(nameTxtPanel);
		
		JPanel dbmsTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		dbmsTxtPanel.add(txtDbms);
		txtPanel.add(dbmsTxtPanel);

		JPanel prfTxtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));		
		prfTxtPanel.add(txtPrf);
		txtPanel.add(prfTxtPanel);
		
		add("Center",txtPanel);
	}
}
class Demo{
	public static void main(String[] args){
		StudentForm s1=new StudentForm("studentForm");
		s1.setVisible(true);
	}
}*/

/*import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame{
	private JButton btExit;
	
	Calculator(String Title){
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		btExit=new JButton("Exit");
		btExit.setFont(new Font("",1,30));
		btExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("Exited....");
				System.exit(0);
			}
		});
		add("North",btExit);
	}
}

class Demo{
	public static void main(String[] args){
		Calculator c1=new Calculator("Calculator");
		c1.setVisible(true);
	}
}*/

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddStudentForm  extends JFrame{
	private JTextField txtStudentId;
	private JTextField txtName;
	private JTextField txtPrfMarks;
	private JTextField txtDbmsMarks;
	
	private JButton btCancel;
	private JButton btAdd;
	
	AddStudentForm(){
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel titleLabel=new JLabel("Add Student Form");
		titleLabel.setFont(new Font("",1,27));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
		//-------------------------------------------------------------
		
		JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btAdd=new JButton("Add Student");
		
		btAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("You pressed add...");
				System.exit(0);
			}
		});
		
		btCancel=new JButton("Cancel");
		
		btCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("You pressed cancle...");
				System.exit(0);
			}
		});
		
		btAdd.setFont(new Font("",1,20));
		btCancel.setFont(new Font("",1,20));
		
		southPanel.add(btAdd);
		southPanel.add(btCancel);
		add("South",southPanel);
		//-------------------------------------------------------------
		
		JLabel lblStudentId=new JLabel("Student ID");
		JLabel lblName=new JLabel("Name");
		JLabel lblPrfMarks=new JLabel("Prf Marks");
		JLabel lblDbmsMarks=new JLabel("Dbms Marks");
		lblStudentId.setFont(new Font("",1,20));
		lblName.setFont(new Font("",1,20));
		lblPrfMarks.setFont(new Font("",1,20));
		lblDbmsMarks.setFont(new Font("",1,20));
		
		JPanel labelPanel=new JPanel(new GridLayout(4,1));
		JPanel idTextPanal=new JPanel(new FlowLayout(FlowLayout.LEFT));
		labelPanel.add(lblStudentId);
		labelPanel.add(lblName);
		labelPanel.add(lblPrfMarks);
		labelPanel.add(lblDbmsMarks);
		add("West",labelPanel);
		
		//-------------------------------------------------------------
		txtStudentId=new JTextField(5);
		txtStudentId.setFont(new Font("",1,20));
		txtName=new JTextField(10);
		txtName.setFont(new Font("",1,20));
		txtPrfMarks=new JTextField(4);
		txtPrfMarks.setFont(new Font("",1,20));
		txtDbmsMarks=new JTextField(4);
		txtDbmsMarks.setFont(new Font("",1,20));
		
		JPanel textPanel=new JPanel(new GridLayout(4,1));
		
		JPanel idTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idTextPanal.add(txtStudentId);
		textPanel.add(idTextPanal);
		
		JPanel nameTextPanal=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanal.add(txtName);
		textPanel.add(nameTextPanal);
		
		JPanel prfMarksTextPanal=new JPanel(new FlowLayout(FlowLayout.LEFT));
		prfMarksTextPanal.add(txtPrfMarks);
		textPanel.add(prfMarksTextPanal);
		
		JPanel dbmsMarksTextPanal=new JPanel(new FlowLayout(FlowLayout.LEFT));
		dbmsMarksTextPanal.add(txtDbmsMarks);
		textPanel.add(dbmsMarksTextPanal);
		add("Center",textPanel);
	}
}
class Demo{
	public static void main(String args[]){
		new AddStudentForm().setVisible(true);
	}
}*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class Calculator extends JFrame{
	private JButton btExit;
	private JTextField txtTitle;
	private JSlider slider;
	
	Calculator(String Title){
		setTitle("Calculator");
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(Calculator.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		
		btExit=new JButton("Exit");
		btExit.setFont(new Font("",1,30));
		btExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("Exited...");
				System.exit(0);
			}
		});
		add(btExit);
		
		txtTitle=new JTextField(10);
		txtTitle.setFont(new Font("",1,30));
		txtTitle.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent evt){
				String title=txtTitle.getText();
				setTitle(title);
			}
		});
		add(txtTitle);
		
		slider=new JSlider(1,10,200,10);
		slider.setFont(new Font("",1,30));
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int value=slider.getValue();
				txtTitle.setText(value+"%");
			}
		});
		add(slider);
	}
}

class Demo{
	public static void main(String[] args){
		Calculator c1=new Calculator("Calculator");
		c1.setVisible(true);
		
	}
}
