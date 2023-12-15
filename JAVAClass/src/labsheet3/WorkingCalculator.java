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
public class WorkingCalculator extends Frame{
    public WorkingCalculator(){
        setSize(500,200);
        setLayout(new GridLayout(4,1));
        setTitle("Calculator");
        setVisible(true);
        
        Label l1=new Label("Number 1");
        Label l2=new Label("Number 2");
        Label l3=new Label("Result");
        
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        TextField t3=new TextField(10);
        t3.setEnabled(false);
        
        Button b1=new Button("  +  ");
        Button b2=new Button("  -  ");
        Button b3=new Button("  *  ");
        Button b4=new Button("  /  ");
        
        Panel p1=new Panel(new FlowLayout());
        Panel p2=new Panel(new FlowLayout());
        Panel p3=new Panel(new FlowLayout());
        Panel p4=new Panel(new FlowLayout());
               
        l1.setPreferredSize(new Dimension(100,25));
        l2.setPreferredSize(new Dimension(100,25));
        l3.setPreferredSize(new Dimension(100,25));
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
               
        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        p3.add(l3);
        p3.add(t3);
        p4.add(b1);
        p4.add(b2);
        p4.add(b3);
        p4.add(b4);
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t3.setText(""+(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t3.setText(""+(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t3.setText(""+(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t3.setText(""+((float)Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText())));
            }
        });
    }
    public static void main(String[] args) {
        new WorkingCalculator();
    }
}
