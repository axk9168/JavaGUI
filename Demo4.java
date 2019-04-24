package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Demo4 {
  public static void main(String[] args) {
    JWindow w = new JWindow();
    
    JPanel panel = new JPanel(); 
    panel.setBackground(Color.BLUE); 
    panel.setLayout(new GridLayout(2,2)); //set panel's layout to flow layout

    JButton b = new JButton("Close");
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {System.exit(0);}
    });
    
    JButton b1 = new JButton("One");
    JButton b2 = new JButton("Two");
    
    panel.add(b); 
    panel.add(b1);
    panel.add(b2);
    
    w.add(panel,BorderLayout.SOUTH);
    w.setSize(300, 300);    
    w.setLocation(500, 100);
    w.setVisible(true);
  }
}
