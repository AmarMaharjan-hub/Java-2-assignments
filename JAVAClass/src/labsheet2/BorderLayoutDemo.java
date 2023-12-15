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
public class BorderLayoutDemo extends Frame{
    public BorderLayoutDemo(){
        setSize(600,400);
        setLayout(new BorderLayout());
        ;;;;
        setVisible(true);
        setTitle("Border Layout Demo");
        Label l1=new Label("I'm the North face.",Label.CENTER);
        Label l2=new Label("I'm the Southe face.",Label.CENTER);
        Label l3=new Label("I'm the East face.",Label.CENTER);
        Label l4=new Label("I'm the West face.",Label.CENTER);
        Label l5=new Label("Don't stare at me.",Label.CENTER);
        add(l1,BorderLayout.NORTH);
        add(l2,BorderLayout.SOUTH);
        add(l3,BorderLayout.EAST);
        add(l4,BorderLayout.WEST);
        add(l5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
