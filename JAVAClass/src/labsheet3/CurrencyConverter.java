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
public class CurrencyConverter extends Frame{
    public CurrencyConverter(){
        setSize(300,150);
        setTitle("Currency Converter");
        setLayout(new GridLayout(3,2));
        setVisible(true);
        Label l1=new Label("Dollar",Label.RIGHT);
        Label l2=new Label("Nepalse",Label.RIGHT);
        Label l3=new Label("Euro",Label.RIGHT);
        TextField t1=new TextField(20);
        TextField t2=new TextField(20);
        TextField t3=new TextField(20);
        t2.setEnabled(false);
        t3.setEnabled(false);
        Panel p1=new Panel(new FlowLayout(FlowLayout.RIGHT));
        Panel p2=new Panel(new FlowLayout(FlowLayout.RIGHT));
        Panel p3=new Panel(new FlowLayout(FlowLayout.RIGHT));
        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        p3.add(l3);
        p3.add(t3);
        add(p1);
        add(p2);
        add(p3);
        
        t1.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent ke){}
            public void keyTyped(KeyEvent ke){}
            public void keyReleased(KeyEvent ke){
                t2.setText(""+(Double.parseDouble(t1.getText())*117.32));
                t3.setText(""+(Double.parseDouble(t1.getText())*0.83));
            }
        });
    }
    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
