/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author riku
 */
public class JRadioButtonDemo extends JFrame implements ActionListener{
    
    JRadioButton rb1,rb2,rb3,rb4;
    JLabel l1,l2;
    
    public JRadioButtonDemo(){
        setSize(400,500);
        setLayout(new GridLayout(3,1));
        setTitle("Payment Methods");
        
        rb1=new JRadioButton("Credit Card");
        rb2=new JRadioButton("Wallet");
        rb3=new JRadioButton("Bank Transfer");
        rb4=new JRadioButton("Cash on Delivery");
        JPanel p1=new JPanel(new GridLayout(3,2));
        JButton b1=new JButton("ok");
        l1=new JLabel("Choose your payment",JLabel.CENTER);
        l2=new JLabel("",JLabel.CENTER);
        l2.setPreferredSize(new Dimension(100,25));
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        p1.add(rb1);
        p1.add(rb2);
        p1.add(rb3);
        p1.add(rb4);
        p1.add(b1);
        add(l1);
        add(p1);
        add(l2);
        setVisible(true);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ie){
        String selected="";
        if(rb1.isSelected())
            selected=rb1.getText();
        if(rb2.isSelected())
            selected=rb2.getText();
        if(rb3.isSelected())
            selected=rb3.getText();
        if(rb4.isSelected())
            selected=rb4.getText();
        l2.setText("You have seelcted "+selected);
    }
    public static void main(String[] args) {
        new JRadioButtonDemo();
    }
}
