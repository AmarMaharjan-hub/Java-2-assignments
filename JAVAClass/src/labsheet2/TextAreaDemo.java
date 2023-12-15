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
public class TextAreaDemo extends Frame{
    public TextAreaDemo(){
        Label l1=new Label("Control in action: TextArea",Label.CENTER);
        Label l2=new Label("Comments: ");
        Button b1=new Button("Show");
        TextArea t1=new TextArea("We are demonstrating TextArea",6,30,TextArea.SCROLLBARS_BOTH);
        Panel p=new Panel();
        p.setLayout(new FlowLayout());
        setSize(400,500);
        setLayout(new GridLayout(3,1));
        setVisible(true);
        setTitle("TextArea Demo");
        add(l1);
        p.add(l2);
        p.add(t1);
        p.add(b1);
        add(p);
    }
    public static void main(String[] args) {
        new TextAreaDemo();
    }
}
