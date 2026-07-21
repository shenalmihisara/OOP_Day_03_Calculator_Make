import javax.swing.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	 //String->Title
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(3);
		f1.setVisible(true);
		try{Thread.sleep(3000);}catch(Exception ex){}
		f1.setVisible(true);
	}
}


//0 - DO_NOTHING_ON_CLOSE
//1 - HIDE_ON_CLOSE
//2 - DISPOSE_ON_CLOSE
//3 - EXIT_ON_CLOSE

//Frame.DO_NOTHING_ON_CLOSE(static variable) -> 0
//Frame.HIDE_ON_CLOSE(static variable) -> 1
//Frame.DISPOSE_ON_CLOSE(static variable) -> 2
//Frame.EXIT_ON_CLOSE(static variable) -> 3
