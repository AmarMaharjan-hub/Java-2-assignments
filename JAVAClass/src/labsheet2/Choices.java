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
public class Choices extends Frame{
    public Choices(){
        setSize(600,400);
        setTitle("Choice Demo");
        setVisible(true);
        setLayout(new GridLayout(1,2));
        Choice c1=new Choice();
        Label l=new Label("Which language do you like most? ");
        c1.add("C");
        c1.add("Java");
        c1.add("Python");
        c1.add("C++");
        c1.add("Dot Net");
        add(l);
        add(c1);
        System.out.println("Items available in choice: "+c1.getItemCount());
        System.out.println("Currently selected item: "+c1.getSelectedItem());
        c1.select(4);
    }
    public static void main(String[] args){
        new Choices();
    }
}
