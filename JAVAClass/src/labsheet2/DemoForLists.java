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
public class DemoForLists extends Frame{
    public DemoForLists(){
        setSize(500,400);
        setTitle("List Demo");
        setLayout(new FlowLayout());
        setVisible(true);
        List lst=new List(4,false);
        Label l=new Label("choose the planet");
       // Panel p=new Panel(new FlowLayout());
        lst.add("Mercury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("Mars");
        lst.add("Jupiter");
        lst.add("Saturn");
        lst.add("Uranus");
        lst.add("Neptune");
        lst.add("pluto");
        add(l);
        add(lst);
        //add(p);
    }
    public static void main(String[] args){
        new DemoForLists();
    }
}
