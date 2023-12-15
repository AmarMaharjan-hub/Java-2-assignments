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
public class Counter extends Frame{
    public Counter(){
        setSize(500,200);
        setTitle("Counter");
        setVisible(true);
        setLayout(new FlowLayout());
        Label l1=new Label("Count");
        TextField t1=new TextField("0",20);
        t1.setEditable(false);
        Button b1=new Button("Up");
        Button b2=new Button("Down");
        Button b3=new Button("Reset");
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num=Integer.parseInt(t1.getText());
                ++num;
                t1.setText(""+num);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num=Integer.parseInt(t1.getText());
                --num;
                t1.setText(""+num);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("0");
            }
        });
    }
    public static void main(String[] args) {
        new Counter();
    }
}
