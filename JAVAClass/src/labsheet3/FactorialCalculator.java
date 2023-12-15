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
public class FactorialCalculator extends Frame{
    public FactorialCalculator(){
        setSize(600,200);
        setVisible(true);
        setTitle("Factorial");
        setLayout(new FlowLayout());
        Label l1=new Label("Number");
        Label l2=new Label("Factorial");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Calculate");
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(t2);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int num=Integer.parseInt(t1.getText());
                int fact=1;
                while(num>0){
                    fact=fact*num;
                    num--;
                }
                t2.setText(""+fact);
            }
        });
    }
    public static void main(String[] args) {
        new FactorialCalculator();
    }
}
