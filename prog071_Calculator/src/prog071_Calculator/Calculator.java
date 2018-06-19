package prog071_Calculator;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Simple calculator adding, subtracting, multiplication and division
 * @author mjurek21
 *
 */
public class Calculator extends JFrame{
	
	private JButton cmdPlus=new JButton("+");//adding button
	private JButton cmdMinus=new JButton("-");//Subtracting button
	private JButton cmdMult=new JButton("*");//multiplication button
	private JButton cmdDiv=new JButton("/");//Division button
	private JButton cmdClr=new JButton("Clear");//Result list clear button
	private JTextField field1=new JTextField();//field for first argument
	private JTextField field2=new JTextField();//field for second argument
	private JList lstNames;	//list of all computations
	private DefaultListModel model=new DefaultListModel();//variable for saving of conducted computations
		
	public Calculator(){
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculator");
		createWindow();
		addListeners();
		setVisible(true);
	}
	/**
	 * Definition of the window
	 */
	private void createWindow(){
		JPanel panel=new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(10,10,10,10));
		panel.add(createTop(),BorderLayout.NORTH);
		panel.add(createCenter());
		panel.add(createBottom(),BorderLayout.SOUTH);
		add(panel);
	}
	/**
	 * Definition of top part of window
	 * @return visualization of top part of the window
	 */
	private JPanel createTop(){
		JPanel panel=new JPanel(new BorderLayout());
		JPanel panel1=new JPanel(new GridLayout(1,2));
		JPanel panel2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel1.add(field1);
		panel1.add(field2);
		panel2.add(cmdPlus);
		panel2.add(cmdMinus);
		panel2.add(cmdMult);
		panel2.add(cmdDiv);
		panel.add(panel1);
		panel.add(panel2, BorderLayout.EAST);
		return panel;
	}
	/**
	 * Definition of central part of window
	 * @return visualization of central part of the window
	 */
	private JPanel createCenter(){
		lstNames=new JList(model);
		JPanel panel=new JPanel(new BorderLayout());
		panel.add(new JScrollPane(lstNames));
		return panel;
	}
	/**
	 * Definition of bottom part of window
	 * @return visualization of bottom part of the window
	 */
	private JPanel createBottom(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(cmdClr);
		return panel;
	}
	/**
	 * Setting of events handling for each button
	 */
	private void addListeners(){
		cmdPlus.addActionListener(new PlusAction());
		cmdMinus.addActionListener(new MinusAction());
		cmdMult.addActionListener(new MultAction());
		cmdDiv.addActionListener(new DivAction());
		cmdClr.addActionListener(new ClrAction());
	}
	/**
	 * Event handling for plus button
	 * @author mjurek21
	 */
	class PlusAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double result=0;
			String arg1=field1.getText().trim();
			String arg2=field2.getText().trim();
			field1.setText("");
			field2.setText("");
			String str="";
			try{
				if(arg1.length()>0&&arg2.length()>0){
					result=Double.parseDouble(arg1)+Double.parseDouble(arg2);
					str=String.format("%s+%s=%.4f", arg1,arg2,result);
					model.addElement(str);
				}
				else if(arg1.length()>0&&arg2.length()<=0){
					str=String.format("%s+0=%s", arg1,arg1);
					model.addElement(str);				
				}
				else if(arg1.length()<=0&&arg2.length()>0){
					str=String.format("0+%s=%s", arg2,arg2);
					model.addElement(str);				
				}
				else if(arg1.length()<=0&&arg2.length()<=0){
					model.addElement("0+0=0");
				}
			}
			catch(Exception ex){
				 model.addElement("At least one of given values is not a number!");
			}
		}
	}
	/**
	 * Event handling for minus button
	 * @author mjurek21
	 */
	class MinusAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double result=0;
			String arg1=field1.getText().trim();
			String arg2=field2.getText().trim();
			field1.setText("");
			field2.setText("");
			String str="";
			try{
				if(arg1.length()>0&&arg2.length()>0){
					result=Double.parseDouble(arg1)-Double.parseDouble(arg2);
					str=String.format("%s-%s=%.4f", arg1,arg2,result);
					model.addElement(str);
				}
				else if(arg1.length()>0&&arg2.length()<=0){
					str=String.format("%s-0=%s", arg1,arg1);
					model.addElement(str);				
				}
				else if(arg1.length()<=0&&arg2.length()>0){
					str=String.format("0-%s=%s", arg2,arg2);
					model.addElement(str);				
				}
				else if(arg1.length()<=0&&arg2.length()<=0){
					model.addElement("0-0=0");
				}
			}
			catch(Exception ex){
				 model.addElement("At least one of given values is not a number!");
			}			
		}
	}
	/**
	 * Event handling for multiplication button
	 * @author mjurek21
	 */
	class MultAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double result=0;
			String arg1=field1.getText().trim();
			String arg2=field2.getText().trim();
			field1.setText("");
			field2.setText("");
			String str="";
			try{
				if(arg1.length()>0&&arg2.length()>0){
					result=Double.parseDouble(arg1)*Double.parseDouble(arg2);
					str=String.format("%s*%s=%.4f", arg1,arg2,result);
					model.addElement(str);
				}
				else if(arg1.length()>0&&arg2.length()<=0){
					str=String.format("%s*0=0", arg1);
					model.addElement(str);				
				}
				else if(arg1.length()<=0&&arg2.length()>0){
					str=String.format("0*%s=0", arg2);
					model.addElement(str);				
				}
				else if(arg1.length()<=0&&arg2.length()<=0){
					model.addElement("0*0=0");
				}
			}
			catch(Exception ex){
				 model.addElement("At least one of given values is not a number!");
			}			
		}
	}
	/**
	 * Event handling for division button
	 * @author mjurek21
	 */
	class DivAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double result=0;
			String arg1=field1.getText().trim();
			String arg2=field2.getText().trim();
			field1.setText("");
			field2.setText("");
			String str="";
			try{
				if(arg1.length()>0&&arg2.length()>0&&Double.parseDouble(arg2)!=0){
					result=Double.parseDouble(arg1)/Double.parseDouble(arg2);
					str=String.format("%s*%s=%.4f", arg1,arg2,result);
					model.addElement(str);
				}
				else if(arg1.length()<=0&&arg2.length()>0){
					str=String.format("0/%s=0", arg2);
					model.addElement(str);				
				}				
				else if((arg1.length()>0&&arg2.length()<=0)||
				(arg1.length()>0&&Double.parseDouble(arg2)==0)){
					model.addElement("Dividing by zero is undefined!");				
				}
			}
			catch(Exception ex){
				 model.addElement("At least one of given values is not a number!");
			}			
		}
	}
	/**
	 * Event handling for clear button
	 * @author mjurek21
	 */
	class ClrAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(JOptionPane.showConfirmDialog(Calculator.this, "Are you sure that you want to delete the list?",
					"Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)
					==JOptionPane.YES_OPTION){
				model.clear();
				field1.setText("");
				field2.setText("");
			}
		}
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
