/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author riku
 */
public class LargestNumberInJavax extends JFrame{
    public LargestNumberInJavax(){
        setSize(300,400);
        setLayout(new GridLayout(3,1));
        setTitle("JTextField Demo");
        JLabel l1=new JLabel("Find the Largest One.",JLabel.CENTER);
        JLabel l2=new JLabel("First Number",JLabel.CENTER);
        JLabel l3=new JLabel("Second Number",JLabel.CENTER);
        JLabel l4=new JLabel("",JLabel.CENTER);
        l4.setPreferredSize(new Dimension(200,25));
        JTextField t1=new JTextField(10);
        JTextField t2=new JTextField(10);
        JButton b1=new JButton("Check");
        JPanel p1=new JPanel(new GridLayout(3,2));
        add(l1);
        add(p1);
        add(l4);
        p1.add(l2);
        p1.add(t1);
        p1.add(l3);
        p1.add(t2);
        p1.add(b1);
        setVisible(true);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1=Integer.parseInt(t1.getText()),num2=Integer.parseInt(t2.getText());
                l4.setText((num1>num2?num1:num2)+" is largest");
            }
        });
    }
    public static void main(String[] args) {
        new LargestNumberInJavax();
    }
}