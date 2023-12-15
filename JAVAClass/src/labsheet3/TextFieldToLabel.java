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
public class TextFieldToLabel extends Frame{
    public TextFieldToLabel(){
        setSize(600,200);
        setLayout(new GridLayout());
        setVisible(true);
        Panel p=new Panel(new FlowLayout());
        Label l1=new Label();
        l1.setPreferredSize(new Dimension(200,25));
        TextField t1=new TextField(20);
        Button b1=new Button("Submit");
        add(p);
        p.add(t1);
        p.add(b1);
        p.add(l1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                l1.setText(t1.getText());
            }
        });
    }
    public static void main(String[] args) {
        new TextFieldToLabel();
    }
}
