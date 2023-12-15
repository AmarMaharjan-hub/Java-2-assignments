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
public class IntegerCounter extends Frame{
    public IntegerCounter(){
        setSize(500,200);
        setVisible(true);
        setTitle("AWT Counter");
        setLayout(new FlowLayout());
        Label l1=new Label("Enter an integer");
        TextField t1=new TextField(20);
        Button b1=new Button("Count Down");
        add(l1);
        add(t1);
        add(b1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str=t1.getText();
                int num=Integer.parseInt(str);
                num--;
                str=String.valueOf(num);
                t1.setText(str);
            }
        }); 
    }
    public static void main(String[] args) {
        new IntegerCounter();
    }
}
