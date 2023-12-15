/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author riku
 */
public class Names extends JFrame{
    public Names(){
        setSize(500,400);
        setLayout(new GridLayout(4,2));
        
        JLabel l1=new JLabel("First Name");
        JLabel l2=new JLabel("Second Name");
        JLabel l3=new JLabel("Last Name");
        
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        
        JButton b1=new JButton("OK");
        JButton b2=new JButton("Cancel");
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=t1.getText(),second=t2.getText(),third=t3.getText();
                if(!first.equals(second)){
                    if(!second.equals(third)){
                        if(!first.equals(third)){
                            System.out.println(first+" "+second+" "+third);
                        }
                    }
                }
            }
        });
        
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new Names();
    }
}
