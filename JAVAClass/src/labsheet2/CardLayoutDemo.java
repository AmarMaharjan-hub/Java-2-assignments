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
public class CardLayoutDemo extends Frame implements ActionListener{
    CardLayout card;
    Button b1,b2,b3,b4;
    public CardLayoutDemo(){
        card=new CardLayout(40,30);
        setSize(600,400);
        setLayout(card);
        setVisible(true);
        setTitle("Card Layout Demo");
        b1=new Button("ACE OF SPADE");
        b2=new Button("ACE OF HEARTS");
        b3=new Button("ACE OF CLUBS");
        b4=new Button("ACE OF DIAMONDS");
        Panel p1=new Panel();
        Panel p2=new Panel();
        Panel p3=new Panel();
        Panel p4=new Panel();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        p1.add(b1);
        p2.add(b2);
        p3.add(b3);
        p4.add(b4);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
    }
    public void actionPerformed(ActionEvent e){
        card.next(this);
    }
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
