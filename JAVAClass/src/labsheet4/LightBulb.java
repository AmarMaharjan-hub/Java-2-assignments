/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author riku
 */
public class LightBulb extends JFrame{
    JToggleButton b1;
    JLabel l1;
    public LightBulb(){
        setSize(250,400);
        setLayout(new FlowLayout());
        setTitle("Light bult");
        
        b1=new JToggleButton("off");
        ImageIcon i1=new ImageIcon("D:/JAVA_Class/imagesForJava/offBulb.png");
        ImageIcon i2=new ImageIcon("D:/JAVA_Class/imagesForJava/onBulb.png");
        l1=new JLabel(i1);
        
        add(b1);
        add(l1);
        setVisible(true);
        
        b1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                if(b1.isSelected()){
                    b1.setText("on");
                    l1.setIcon(i2);
                }else{
                    b1.setText("off");
                    l1.setIcon(i1);
                }
            }
        });
        
    }
    public static void main(String[] args) {
        new LightBulb();
    }
}
