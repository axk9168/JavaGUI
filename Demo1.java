package demo;

import javax.swing.*;
public class Demo1 {
  public static void main(String[] args) {
    JFrame f = new JFrame("The Frame");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //add exit on close
    f.setSize(300, 300);    
    f.setLocation(100, 100);
    f.setVisible(true);    
  }
}
