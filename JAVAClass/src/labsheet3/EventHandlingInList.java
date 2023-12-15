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
public class EventHandlingInList extends Frame{
    public EventHandlingInList(){
        setSize(600,300);
        setVisible(true);
        setTitle("Event handling in list");
        setLayout(new GridLayout(2,1));
        Label l1=new Label("Select an item from the List: ");
        Label l2=new Label("Select multiple item from the list: ");
        Label l3=new Label("Selected Item: ");
        Label l4=new Label("Selected Item: ");
        List ls1=new List(3);
        List ls2=new List(5,true);
        l3.setPreferredSize(new Dimension(200,25));
        l4.setPreferredSize(new Dimension(200,25));
        ls1.add("Dog");
        ls1.add("Cat");
        ls1.add("Mouse");
        ls2.add("Pigeon");
        ls2.add("Dove");
        ls2.add("Crow");
        ls2.add("Sparrow");
        ls2.add("Parrots");
        Panel p1=new Panel(new FlowLayout());
        Panel p2=new Panel(new FlowLayout());
        p1.add(l1);
        p1.add(ls1);
        p1.add(l3);
        p2.add(l2);
        p2.add(ls2);
        p2.add(l4);
        add(p1);
        add(p2);
        ls1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
//                l1.setText("Selected Item: "+l3.get);
            }
        });
    }
    public static void main(String[] args) {
        new EventHandlingInList();
    }
}
