/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet1;
import java.awt.*;
/**
 *
 * @author riku
 */
public class UsingTextField {
    public UsingTextField(){
        Frame f=new Frame();
        TextField t=new TextField();
        Label l=new Label("User ID");
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
        l.setBounds(50,100,80,30);
        f.add(l);
        t.setBounds(131,100,150,30);
        f.add(t);
    }
    public static void main(String[] args){
        UsingTextField obj1=new UsingTextField();
    }
}
