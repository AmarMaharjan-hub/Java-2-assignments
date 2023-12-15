/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet3;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author riku
 */
public class NumberSwap extends Frame{
    public NumberSwap(){
        setSize(400,200);
        setLayout(new GridLayout(3,2));
        setVisible(true);
        setTitle("Swap");
        Label l1=new Label("Number 1");
        Label l2=new Label("Number 2");
        TextField t1=new TextField(15);
        TextField t2=new TextField(15);
        Button b1= new Button("Swap");
        b1.setPreferredSize(new Dimension(150,25));
        Panel p1=new Panel();
        Panel p2=new Panel();
        Panel p3=new Panel();
        add(l1);
        add(p1);
        add(l2);
        add(p2);
        add(p3);
        p1.add(t1);
        p2.add(t2);
        p3.add(b1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String temp=t2.getText();
                t2.setText(t1.getText());
                t1.setText(temp);
            }
        });
        
    }
    public static void main(String[] args) {
        new NumberSwap();
    }
}
