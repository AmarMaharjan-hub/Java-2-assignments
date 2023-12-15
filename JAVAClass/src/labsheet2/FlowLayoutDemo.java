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
public class FlowLayoutDemo extends Frame{
    public FlowLayoutDemo(){
        setSize(500,300);
        setLayout(new FlowLayout());
        setTitle("Flow Layout Demo");
        setVisible(true);
        Label l1=new Label("Nothing just a plain old text.");
        Label l2=new Label("Another text");
        TextField t1=new TextField("Just need to occupy some space for Demo");
        TextField t2=new TextField("A little bit more");
        Button b1=new Button("Dog");
        Button b2=new Button("Cat");
        Button b3=new Button("Hen");
        add(l1);
        add(b1);
        add(l2);
        add(b2);
        add(t1);
        add(b3);
        add(t2);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
