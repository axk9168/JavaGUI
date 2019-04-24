package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Demo3 {
  public static void main(String[] args) {
    JWindow w = new JWindow();
    
    JPanel panel = new JPanel(); //create panel
    panel.setBackground(Color.BLUE); //set panel BG color
    panel.setLayout(new FlowLayout());

    JButton b = new JButton("Close");
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {System.exit(0);}
    });

    JButton b1 = new JButton("B1");
    JButton b2 = new JButton("B2");
    
    panel.add(b); //add button to panel
    panel.add(b1);
    panel.add(b2);
    w.add(panel,BorderLayout.SOUTH); //add panel to main window
    w.setSize(300, 300);    
    w.setLocation(500, 100);
    w.setVisible(true);
  }
}
