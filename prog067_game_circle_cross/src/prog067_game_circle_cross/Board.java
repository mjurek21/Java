package prog067_game_circle_cross;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.*;

public class Board implements ActionListener{
	public void actionPerformed(ActionEvent event){
		String str=event.getActionCommand();
		
		//Setting of cross first player
		if((player==false)&&(str.equals("1"))&&(gameArray[0][0]==0)){
			button1.setIcon(new ImageIcon("cross.jpg"));
			gameArray[0][0]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		if((player==false)&&(str.equals("2"))&&(gameArray[1][0]==0)){
			button2.setIcon(new ImageIcon("cross.jpg"));
			gameArray[1][0]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		if((player==false)&&(str.equals("3"))&&(gameArray[2][0]==0)){
			button3.setIcon(new ImageIcon("cross.jpg"));
			gameArray[2][0]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		if((player==false)&&(str.equals("4"))&&(gameArray[0][1]==0)){ 	
			button4.setIcon(new ImageIcon("cross.jpg"));
			gameArray[0][1]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		if((player==false)&&(str.equals("5"))&&(gameArray[1][1]==0)){ 	
			button5.setIcon(new ImageIcon("cross.jpg"));
			gameArray[1][1]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		if((player==false)&&(str.equals("6"))&&(gameArray[2][1]==0)){
			button6.setIcon(new ImageIcon("cross.jpg"));
			gameArray[2][1]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		if((player==false)&&(str.equals("7"))&&(gameArray[0][2]==0)){
			button7.setIcon(new ImageIcon("cross.jpg"));
			gameArray[0][2]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		if((player==false)&&(str.equals("8"))&&(gameArray[1][2]==0)){
			button8.setIcon(new ImageIcon("cross.jpg"));
			gameArray[1][2]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		if((player==false)&&(str.equals("9"))&&(gameArray[2][2]==0)){
			button9.setIcon(new ImageIcon("cross.jpg"));
			gameArray[2][2]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		
		//Setting of circle second player
		if((player==true)&&(str.equals("1"))&&(gameArray[0][0]==0)){
			button1.setIcon(new ImageIcon("circle.jpg"));
			gameArray[0][0]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if((player==true)&&(str.equals("2"))&&(gameArray[1][0]==0)){
			button2.setIcon(new ImageIcon("circle.jpg"));
			gameArray[1][0]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if((player==true)&&(str.equals("3"))&&(gameArray[2][0]==0)){
			button3.setIcon(new ImageIcon("circle.jpg"));
			gameArray[2][0]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if((player==true)&&(str.equals("4"))&&(gameArray[0][1]==0)){ 	
			button4.setIcon(new ImageIcon("circle.jpg"));
			gameArray[0][1]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if((player==true)&&(str.equals("5"))&&(gameArray[1][1]==0)){ 	
			button5.setIcon(new ImageIcon("circle.jpg"));
			gameArray[1][1]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if((player==true)&&(str.equals("6"))&&(gameArray[2][1]==0)){
			button6.setIcon(new ImageIcon("circle.jpg"));
			gameArray[2][1]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if((player==true)&&(str.equals("7"))&&(gameArray[0][2]==0)){
			button7.setIcon(new ImageIcon("circle.jpg"));
			gameArray[0][2]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if((player==true)&&(str.equals("8"))&&(gameArray[1][2]==0)){
			button8.setIcon(new ImageIcon("circle.jpg"));
			gameArray[1][2]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if((player==true)&&(str.equals("9"))&&(gameArray[2][2]==0)){
			button9.setIcon(new ImageIcon("circle.jpg"));
			gameArray[2][2]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}			

	}
	
	private JFrame frame;
	private JButton button,button1,button2,button3,button4,button5,button6,button7,button8,button9;
	private int[][] gameArray;
	private static boolean player;
	
	public Board(){
		player=false;
		gameArray=new int[3][3];
		for(int i=0;i<gameArray.length;i++){
			for(int j=0;j<gameArray[i].length;j++){
				gameArray[i][j]=0;
			}
		}
			
		frame=new JFrame();
		frame.setLayout(new GridLayout(3,3));
		
		/*for(int i=0;i<9;i++){
			button=new JButton(Integer.toString(i));
			frame.add(button);
			button.addActionListener(this);
			button.setBackground(Color.WHITE);
			button.setForeground(Color.WHITE);
		}*/
		button1=new JButton("1");
		frame.add(button1);
		button1.addActionListener(this);
		button1.setBackground(Color.WHITE);
		button1.setForeground(Color.WHITE);
		
		button2=new JButton("2");
		frame.add(button2);
		button2.addActionListener(this);
		button2.setBackground(Color.WHITE);
		button2.setForeground(Color.WHITE);
		
		button3=new JButton("3");
		frame.add(button3);
		button3.addActionListener(this);
		button3.setBackground(Color.WHITE);
		button3.setForeground(Color.WHITE);
		
		button4=new JButton("4");
		frame.add(button4);
		button4.addActionListener(this);
		button4.setBackground(Color.WHITE);
		button4.setForeground(Color.WHITE);
		
		button5=new JButton("5");
		frame.add(button5);
		button5.addActionListener(this);
		button5.setBackground(Color.WHITE);
		button5.setForeground(Color.WHITE);
		
		button6=new JButton("6");
		frame.add(button6);
		button6.addActionListener(this);
		button6.setBackground(Color.WHITE);
		button6.setForeground(Color.WHITE);
		
		button7=new JButton("7");
		frame.add(button7);
		button7.addActionListener(this);
		button7.setBackground(Color.WHITE);
		button7.setForeground(Color.WHITE);
		
		button8=new JButton("8");
		frame.add(button8);
		button8.addActionListener(this);
		button8.setBackground(Color.WHITE);
		button8.setForeground(Color.WHITE);
		
		button9=new JButton("9");
		frame.add(button9);
		button9.addActionListener(this);
		button9.setBackground(Color.WHITE);
		button9.setForeground(Color.WHITE);
		
		frame.setTitle("Cross/Circle game");
		frame.setSize(new Dimension(300,300));
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public boolean game(){
		//Cases when wins player setting crosses
		if((gameArray[0][0]==1)&&(gameArray[0][1]==1)&&(gameArray[0][2]==1))return true;
		if((gameArray[1][0]==1)&&(gameArray[1][1]==1)&&(gameArray[1][2]==1))return true;
		if((gameArray[2][0]==1)&&(gameArray[2][1]==1)&&(gameArray[2][2]==1))return true;
		
		if((gameArray[0][0]==1)&&(gameArray[1][0]==1)&&(gameArray[2][0]==1))return true;
		if((gameArray[0][1]==1)&&(gameArray[1][1]==1)&&(gameArray[2][1]==1))return true;
		if((gameArray[0][2]==1)&&(gameArray[1][2]==1)&&(gameArray[2][2]==1))return true;
		
		if((gameArray[0][0]==1)&&(gameArray[1][1]==1)&&(gameArray[2][2]==1))return true;
		if((gameArray[0][2]==1)&&(gameArray[1][1]==1)&&(gameArray[2][0]==1))return true;

		//Cases when wins player setting circles
		if((gameArray[0][0]==2)&&(gameArray[0][1]==2)&&(gameArray[0][2]==2))return true;
		if((gameArray[1][0]==2)&&(gameArray[1][1]==2)&&(gameArray[1][2]==2))return true;
		if((gameArray[2][0]==2)&&(gameArray[2][1]==2)&&(gameArray[2][2]==2))return true;
		
		if((gameArray[0][0]==2)&&(gameArray[1][0]==2)&&(gameArray[2][0]==2))return true;
		if((gameArray[0][1]==2)&&(gameArray[1][1]==2)&&(gameArray[2][1]==2))return true;
		if((gameArray[0][2]==2)&&(gameArray[1][2]==2)&&(gameArray[2][2]==2))return true;
		
		if((gameArray[0][0]==2)&&(gameArray[1][1]==2)&&(gameArray[2][2]==2))return true;
		if((gameArray[0][2]==2)&&(gameArray[1][1]==2)&&(gameArray[2][0]==2))return true;	
		
		//any of above cases is not fulfilled play further
		return false;
	}
}
