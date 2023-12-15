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
public class ButtonLayout1 {
    ButtonLayout1(){
        Frame f=new Frame("Hello World");
        Button b1=new Button("one");
        Button b2=new Button("two");
        Button b3=new Button("three");
        Button b4=new Button("four");
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
        b1.setBounds(50,100,80,30);
        b2.setBounds(150,100,80,30);
        b3.setBounds(50,180,80,30);
        b4.setBounds(150,180,80,30);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
    }
    public static void main(String[] args){
        ButtonLayout1 obj1=new ButtonLayout1();
    }
}
