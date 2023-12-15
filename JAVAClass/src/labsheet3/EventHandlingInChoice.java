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
public class EventHandlingInChoice extends Frame{
    public EventHandlingInChoice(){
        setSize(600,100);
        setVisible(true);
        setTitle("Choices");
        setLayout(new FlowLayout());
        Label l1=new Label("Select an Item: ");
        Label l2=new Label("Selected Item: ");
        l2.setPreferredSize(new Dimension(200,25));
        Choice c1=new Choice();
        c1.add("Football");
        c1.add("Baskteball");
        c1.add("Hockey");
        c1.add("Tennis");
        c1.add("Golf");
        add(l1);
        add(c1);
        add(l2);
        c1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                l2.setText("Selected Item: "+c1.getSelectedItem());
            }
        });
    }
    public static void main(String[] args) {
        new EventHandlingInChoice();
    }
}
