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
public class GridLayoutDemo extends Frame{
    public GridLayoutDemo(){
        setSize(600,400);
        setLayout(new GridLayout(2,2));
        setVisible(true);
        setTitle("Grid Layout Demo");
        Label l1=new Label("This window is divided into four parts.",Label.CENTER);
        Label l2=new Label("The left to this is the first part.",Label.RIGHT);
        Label l3=new Label("The top right is the second part.",Label.LEFT);
        Label l4=new Label("Hello I'm the fourth part",Label.CENTER);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
