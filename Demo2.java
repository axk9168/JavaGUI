package demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Demo2 {
  public static void main(String[] args) {
    JWindow w = new JWindow();
    
    JButton b = new JButton("Close"); //create close button
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {System.exit(0);} //add exit on close
    });

    w.add(b); //add button to main window
    w.setSize(300, 300);    
    w.setLocation(500, 100);
    w.setVisible(true);
  }
}
