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
public class HelloWorld {
    public HelloWorld(){
        Frame f=new Frame("Hello World");
        Button b=new Button("Hello");
        f.setSize(600,400);
        f.setVisible(true);
        f.setLayout(null);
        b.setBounds(50,100,60,20);
        f.add(b);
    }
    public static void main(String args[]){
        HelloWorld obj1=new HelloWorld();
    }
}
