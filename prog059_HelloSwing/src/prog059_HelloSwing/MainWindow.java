package prog059_HelloSwing;


import javax.swing.*;

public class MainWindow{

	public static void main(String [] args){
		String str=new String();
		String str1=new String();
		int choice=-1;
		str=JOptionPane.showInputDialog(null, "Please give your name", null);
		
		choice=JOptionPane.showConfirmDialog(null, "Hello "+str+"! Do you want to continue?");
		if(choice==JOptionPane.YES_OPTION){
			str1=JOptionPane.showInputDialog(null, "How old are you?", null);
			try{
				int age=Integer.parseInt(str1);
				JOptionPane.showMessageDialog(null, "Your name is "+str+" and you are "
						+age+" years old!");
			}
			catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null, "Invalide integer!");
			}

		}
		if(choice==JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, "We are sorry!");
		}
		if(choice==JOptionPane.CANCEL_OPTION){
			JOptionPane.showMessageDialog(null, "We understand!");
		}
		
	}
	
}

