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
public class MouseEventDemo extends Frame{
    public MouseEventDemo(){
        setSize(600,400);
        setVisible(true);
        setTitle("Java MouseEvent Example");
        setLayout(new GridLayout(3,1));
        Label l1=new Label("Mouse Listener",Label.CENTER);
        Label l2=new Label("Welcome to MouseEventDemo");
        Label l3=new Label("",Label.CENTER);
        l3.setPreferredSize(new Dimension(100,25));
        Panel p1=new Panel();
        p1.setBackground(Color.MAGENTA);
        p1.setPreferredSize(new Dimension(400,40));
        p1.add(l2);
        Panel lay=new Panel();
        lay.add(p1);
        add(l1);
        add(lay);
        add(l3);
        p1.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent me){
                l3.setText("Mouse Clicked: ("+me.getX()+","+me.getY()+")");
            }
            public void mousePressed(MouseEvent me){}
            public void mouseReleased(MouseEvent me){}
            public void mouseEntered(MouseEvent me){}
            public void mouseExited(MouseEvent me){}
        });
    }
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
