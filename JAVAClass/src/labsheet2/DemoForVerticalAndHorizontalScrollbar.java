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
public class DemoForVerticalAndHorizontalScrollbar extends Frame{
    public DemoForVerticalAndHorizontalScrollbar(){
        setSize(600,400);
        setTitle("Horizontal and Vertical Scrollbar");
        setVisible(true);
        Scrollbar hsb=new Scrollbar(Scrollbar.HORIZONTAL,1,5,1,100);
        Scrollbar vsb=new Scrollbar(Scrollbar.VERTICAL,1,5,1,100);
        setLayout(null);
        vsb.setBounds(100,100,50,300);
        hsb.setBounds(200,100,300,50);
        add(hsb);
        add(vsb);
    }
    public static void main(String[] args){
        new DemoForVerticalAndHorizontalScrollbar();
    }
}
