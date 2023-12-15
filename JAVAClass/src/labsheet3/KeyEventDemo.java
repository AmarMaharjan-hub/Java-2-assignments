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
public class KeyEventDemo extends Frame{
    public KeyEventDemo(){
        setSize(600,400);
        setVisible(true);
        setTitle("Key Event");
        setLayout(new FlowLayout());
        Label l1=new Label("enter text");
        Label l2=new Label();
        TextField t1=new TextField(20);
        l2.setPreferredSize(new Dimension(100,25));
        add(l1);
        add(t1);
        add(l2);
        t1.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent ke){}
            public void keyTyped(KeyEvent ke){}
            public void keyReleased(KeyEvent ke){
                l2.setText(t1.getText());
            }
        });        
    }
    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
