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
public class ButtonStyle1 extends Frame{
    public ButtonStyle1(){
        setTitle("Button Demo");
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(2,2));
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        b2.setEnabled(false);
        b4.setEnabled(false);
        b1.setLabel("One");
        b3.setLabel("Three");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    public static void main(String[] args){
        new ButtonStyle1();
    }
}
