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
public class JCheckBoxDemo extends JFrame implements ActionListener{
    JCheckBox c1,c2,c3,c4;
    JLabel l1,l2,l3;
    public JCheckBoxDemo(){
        setSize(400,500);
        setLayout(new GridLayout(3,1));
        setTitle("Food Ordering System");
        
        l1=new JLabel("Food Ordering System",JLabel.CENTER);
        l2=new JLabel("",JLabel.CENTER);
        l2.setPreferredSize(new Dimension(200,25));
        JPanel p1=new JPanel(new GridLayout(3,2));
        JButton b1=new JButton("submit");
        c1=new JCheckBox("Momo");
        c2=new JCheckBox("Pizza");
        c3=new JCheckBox("Chowmein");
        c4=new JCheckBox("Fry Rice");
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        p1.add(c4);
        p1.add(b1);
        add(l1);
        add(p1);
        add(l2);
        setVisible(true);
        b1.addActionListener(this);   
    }
    public void actionPerformed(ActionEvent ie){
        l3=new JLabel("");
        int count=0;
        if(c1.isSelected()){
            count++;
            l3.setText(c1.getText());
        }
        if(c2.isSelected()){
            count++;
            l3.setText(l3.getText()+" "+c2.getText());
        }
        if(c3.isSelected()){
            count++;
            l3.setText(l3.getText()+" "+c3.getText());
        }
        if(c4.isSelected()){
            count++;
            l3.setText(l3.getText()+" "+c4.getText());
        }
        l2.setText("You have selected "+count+" items they are "+l3.getText());
    }
    public static void main(String[] args) {
        new JCheckBoxDemo();
    }
}
