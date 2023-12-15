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
public class Checkboxes extends Frame{
    public Checkboxes(){
        setTitle("Checkbox Demo");
        setSize(500,700);
        setLayout(new GridLayout(8,1));
        setVisible(true);
        setLocationRelativeTo(null);
        Label l1=new Label("Choose program to enroll");
        Label l2=new Label("Payment");
        Checkbox c1=new Checkbox("C");
        Checkbox c2=new Checkbox("JAVA");
        Checkbox c3=new Checkbox("HTML");
        Checkbox c4=new Checkbox("PHP");
        CheckboxGroup cg=new CheckboxGroup();
        Checkbox c5=new Checkbox("Now",false,cg);
        Checkbox c6=new Checkbox("Later",cg,true);
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(l2);
        add(c5);
        add(c6);
    }
    public static void main(String[] args){
        new Checkboxes();
    }
}
