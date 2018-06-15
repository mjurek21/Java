import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.*;

import com.sun.glass.events.KeyEvent;
/**
 * Class defines cross circle game GUI and the game itself
 * @version 2
 * @author mjurek21
 *
 */
public class Board implements ActionListener{

	private JFrame frame;
	//list of buttons
	private ArrayList<JButton> buttons;
	//array used for verification of game status
	private int[] gameArray;
	//variable defines actual player
	private static boolean player;
	/**
	 * Constructor - Initialization of variables
	 */
	public Board(){
		frame=new JFrame();	
		buttons=new ArrayList<JButton>();
		player=false;//first player (False) second player (true)
		gameArray=new int[9];
		for(int i=0;i<gameArray.length;i++){
			gameArray[i]=0;
		}
		frame.setLayout(new GridLayout(3,3));
		
		//placement of buttons
		for(int i=0;i<gameArray.length;i++){
			JButton button=new JButton(Integer.toString(i));
			buttons.add(button);
			frame.add(button);
			button.addActionListener(this);
			button.setBackground(Color.WHITE);
			button.setForeground(Color.WHITE);
		}
		
		frame.setTitle("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300,300));
		frame.setResizable(false);
		frame.setVisible(true);
	}
	/**
	 * Method checks if actual player won this game 
	 * @return true if player won
	 */
	public boolean game(){
		//Cases when a player wins
		if((gameArray[0]==gameArray[1])&&(gameArray[1]==gameArray[2])&&(gameArray[0]!=0))return true;
		if((gameArray[3]==gameArray[4])&&(gameArray[4]==gameArray[5])&&(gameArray[3]!=0))return true;
		if((gameArray[6]==gameArray[7])&&(gameArray[7]==gameArray[8])&&(gameArray[6]!=0))return true;	
		if((gameArray[0]==gameArray[3])&&(gameArray[3]==gameArray[6])&&(gameArray[0]!=0))return true;
		if((gameArray[1]==gameArray[4])&&(gameArray[4]==gameArray[7])&&(gameArray[1]!=0))return true;
		if((gameArray[2]==gameArray[5])&&(gameArray[5]==gameArray[8])&&(gameArray[2]!=0))return true;
		if((gameArray[0]==gameArray[4])&&(gameArray[4]==gameArray[8])&&(gameArray[0]!=0))return true;
		if((gameArray[2]==gameArray[4])&&(gameArray[4]==gameArray[6])&&(gameArray[2]!=0))return true;

		//Above cases are not fulfilled play further
		return false;
	}
	/**
	 * Performed action when field on borad was pressed
	 */
	public void actionPerformed(ActionEvent event){
		String str=event.getActionCommand();
		
		//Setting of crosses by first player
		if((player==false)&&(gameArray[Integer.parseInt(str)]==0)){
			buttons.get(Integer.parseInt(str)).setIcon(new ImageIcon("cross.jpg"));
			gameArray[Integer.parseInt(str)]=1;
			player=true;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting crosses won!");
			}
		}
		//Setting of circles by second player
		if((player==true)&&(gameArray[Integer.parseInt(str)]==0)){
			buttons.get(Integer.parseInt(str)).setIcon(new ImageIcon("circle.jpg"));
			gameArray[Integer.parseInt(str)]=2;
			player=false;
			if(game()){
				JOptionPane.showMessageDialog(null, "Player setting circles won!");
			}
		}
		if(game()){
			for(int i=0;i<gameArray.length;i++){
				if(gameArray[i]==0){
					gameArray[i]=3;
				}
			}
		}
		
	}
}
