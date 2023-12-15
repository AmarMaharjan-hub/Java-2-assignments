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
public class DemoForMultipleList extends Frame{
    public DemoForMultipleList(){
        setSize(600,400);
        setTitle("List");
        setLayout(new GridLayout(1,2));
        setVisible(true);
        List lst=new List(7,true);
        Label l=new Label("Select your favourite sports from the list: ");
        Panel p=new Panel(new FlowLayout());
        lst.add("Badminton");
        lst.add("Hockey");
        lst.add("Tennis");
        lst.add("Football");
        lst.add("Cricket");
        lst.add("Formula One");
        lst.add("Rugby");
        p.add(l);
        p.add(lst);
        add(p);
    }
    public static void main(String[] args){
        new DemoForMultipleList();
    }
}
