package prog035_graph_ex1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Graph2D extends Canvas{
	
	public void paint(Graphics draw){
		draw.setColor(Color.red);
		draw.fillOval(150, 150, 300, 300);
	} 
	public static void main(String[] args) {
		JFrame frame=new JFrame("Flag of Japan");
		Canvas canvas=new Graph2D();
		canvas.setSize(600,600);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
		canvas.setBackground(Color.white);
	}

}
