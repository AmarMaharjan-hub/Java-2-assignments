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
public class JavaFounder extends JFrame implements ActionListener{
    JLabel l1,l2;
    public JavaFounder(){
        setSize(300,400);
        setLayout(new GridLayout(3,1));
        setTitle("Guess the Answer");
        l1=new JLabel("Who is the founder of java?",JLabel.CENTER);
        l2=new JLabel("",JLabel.CENTER);
        JButton b1=new JButton("Dennis Ritchie");
        JButton b2=new JButton("James Gosling");
        JButton b3=new JButton("Guldo Van Rossum");
        JButton b4=new JButton("Patrick Naughton");
        JPanel p1=new JPanel(new GridLayout(2,2));
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        add(l1);
        add(p1);
        add(l2);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if((ae.getActionCommand()).equals("James Gosling"))
            l2.setText("You are correct");
        else
            l2.setText("You are incorrect");
    }
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        }catch(Exception e){
            e.printStackTrace();
        }
        new JavaFounder();
    }
}