package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZTest0 {
  public static void main(String[] args) {
    JWindow w = new JWindow();
    
    JTextField textbox = new JTextField();
    textbox.setHorizontalAlignment(JTextField.RIGHT);
    textbox.setFont(new Font("Consolas", Font.BOLD, 40));
    textbox.setText("0");
    w.add(textbox,BorderLayout.NORTH);
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.BLUE);
    panel.setLayout(new GridLayout(5,4));
    w.add(panel,BorderLayout.CENTER);
    
    JButton b = new JButton("Close");
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {System.exit(0);}
    });
    panel.add(b);
    
    JButton b2 = new JButton("C");
    b2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {textbox.setText("0");}
    });
    panel.add(b2);  
    
    int c = 0x232B;
    String s = Character.toString((char)c);
    JButton b3 = new JButton(s);
    panel.add(b3);
    
    int c1 = 0x00F7;
    String s1 = Character.toString((char)c1);
    JButton b4 = new JButton(s1);
    panel.add(b4);
    
    JButton b5 = new JButton("7");
    b5.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {textbox.setText("7");}
    });
    panel.add(b5);
    
    JButton b6 = new JButton("8");
    panel.add(b6);
    
    JButton b7 = new JButton("9");
    panel.add(b7);
    JButton b8 = new JButton("X");
    panel.add(b8);
    JButton b9 = new JButton("4");
    panel.add(b9);
    JButton bA = new JButton("5");
    panel.add(bA);
    JButton bB = new JButton("6");
    panel.add(bB);
    JButton bC = new JButton("-");
    panel.add(bC);
    JButton bD = new JButton("1");
    panel.add(bD);
    JButton bE = new JButton("2");
    panel.add(bE);
    JButton bF = new JButton("3");
    panel.add(bF);
    JButton b10 = new JButton("+");
    panel.add(b10);
    
    int c2 = 0x00B1;
    String s2 = Character.toString((char)c2);
    JButton b11 = new JButton(s2);
    
    panel.add(b11);
    JButton b12 = new JButton("0");
    panel.add(b12);
    JButton b13 = new JButton(".");
    panel.add(b13);
    JButton b14 = new JButton("=");
    panel.add(b14);
    
    w.setSize(300, 300);    
    w.setLocation(500, 100);
    w.setVisible(true);
  }
}