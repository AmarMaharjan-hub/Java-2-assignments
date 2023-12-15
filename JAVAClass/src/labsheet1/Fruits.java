/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet1;
import java.awt.*;
/**
 *
 * @author riku
 */
public class Fruits {
    Fruits(){
        Frame f=new Frame("Hello World");
        Button b1=new Button("Apple");
        Button b2=new Button("Orange");
        Button b3=new Button("Guava");
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
        b1.setBounds(50,100,80,30);
        b2.setBounds(140,100,80,30);
        b3.setBounds(230,100,80,30);
        f.add(b1);
        f.add(b2);
        f.add(b3);
    }
    public static void main(String[] args){
        Fruits f=new Fruits();
    }
}
