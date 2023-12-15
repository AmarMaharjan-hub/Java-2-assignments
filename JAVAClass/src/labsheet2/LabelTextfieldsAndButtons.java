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
public class LabelTextfieldsAndButtons extends Frame{
    public LabelTextfieldsAndButtons(){
        setTitle("Label Demo");
        setVisible(true);
        setLayout(new GridLayout(3,2));
        setSize(500,200);
        setLocationRelativeTo(null);
        Label l1=new Label("Name",Label.LEFT);
        Label l2=new Label("Address",Label.LEFT);
        TextField t1=new TextField();
        TextField t2=new TextField();
        Button b1=new Button("Ok");
        Button b2=new Button("Cancel");
        l1.setText("Full Name");
        l1.setAlignment(Label.CENTER);
        l2.setAlignment(Label.CENTER);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
    }
    public static void main(String[] args){
        new LabelTextfieldsAndButtons();
    }
}
