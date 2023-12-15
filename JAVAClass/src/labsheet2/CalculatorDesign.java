/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet2;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author riku
 */
public class CalculatorDesign extends Frame{
    public CalculatorDesign(){
        setSize(400,200);
        setLayout(new GridLayout(4,2));
        setVisible(true);
        setTitle("Calculator");
        Label l1=new Label("First Number");
        Label l2=new Label("Second Number");
        Label l3=new Label("Result");
        Button b1=new Button("+");
        Button b2=new Button("-");
        TextField t1=new TextField("Hello");
        TextField t2=new TextField("World");
        TextField t3=new TextField("!!!");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
    }
    public static void main(String[] args){
        new CalculatorDesign();
    }
}
