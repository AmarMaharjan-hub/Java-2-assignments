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
public class PanelBackgroundColor extends Frame{
    public PanelBackgroundColor(){
        setSize(500,500);
        setLayout(new GridLayout(1,1));
        setVisible(true);
        setTitle("Choose a color");
        Panel p=new Panel();
        p.setPreferredSize(new Dimension(500,500));
        Button b1=new Button("RED");
        Button b2=new Button("GREEN");
        Button b3=new Button("BLUE");
        Button b4=new Button("CLOSE");
        add(p);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                p.setBackground(Color.red);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                p.setBackground(Color.green);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                p.setBackground(Color.blue);
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new PanelBackgroundColor();
    }
}
