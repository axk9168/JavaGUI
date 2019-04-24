package demo;

import java.awt.*;
import javax.swing.*;

public class ExamplePanes
{
   public static void main(String[] args)
   {
	   JFrame frame = new JFrame();
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   JButton b1 = new JButton("BUTTON 1");
	   JButton b2 = new JButton("BUTTON 2");
	   JButton b3 = new JButton("BUTTON 3");
	   JButton b4 = new JButton("BUTTON 4");
	   JButton b5 = new JButton("BUTTON 5");
	   JButton b12 = new JButton("BUTTON 1");
	   JButton b22 = new JButton("BUTTON 2");
	   JButton b32 = new JButton("BUTTON 3");
	   JButton b42 = new JButton("BUTTON 4");
	   JButton b52 = new JButton("BUTTON 5");
	   JButton b13 = new JButton("BUTTON 1");
	   JButton b23 = new JButton("BUTTON 2");
	   JButton b33 = new JButton("BUTTON 3");
	   JButton b43 = new JButton("BUTTON 4");
	   JButton b53 = new JButton("BUTTON 5");
	   
	   JPanel panel = new JPanel();
	   panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	   panel.setBackground(Color.BLUE);
	   panel.add(b1);
	   panel.add(b2);
	   panel.add(b3);
	   panel.add(b4);
	   panel.add(b5);
	   frame.add(panel,BorderLayout.EAST);
	   
	   JPanel panel2 = new JPanel();
	   panel2.setLayout(new FlowLayout());
	   panel2.setBackground(Color.green);
	   panel2.add(b12);
	   panel2.add(b22);
	   panel2.add(b32);
	   panel2.add(b42);
	   panel2.add(b52); 
	   frame.add(panel2,BorderLayout.SOUTH);
       
	   JPanel panel3 = new JPanel();
	   panel3.setLayout(new BorderLayout());
	   panel3.setBackground(Color.BLACK);
	   panel3.add(b13,BorderLayout.NORTH);
	   panel3.add(b23,BorderLayout.SOUTH);
	   panel3.add(b33,BorderLayout.WEST);
	   panel3.add(b43,BorderLayout.EAST);
	   panel3.add(b53,BorderLayout.CENTER); 
	   frame.add(panel3,BorderLayout.WEST);
	   
	   frame.pack();
	   frame.setVisible(true);
   }
}
