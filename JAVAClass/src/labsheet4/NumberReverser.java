/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author riku
 */
public class NumberReverser extends Frame{
    TextField t1,t2;
    public NumberReverser(){
        setSize(500,200);
        setVisible(true);
        setTitle("Reverse Number");
        setLayout(new GridLayout(2,1));
        Label l1=new Label("Number");
        Label l2=new Label("Reverse");
        Button b1=new Button("Reverse");
        t1=new TextField();
        t2=new TextField();
        t2.setEnabled(false);
        Panel p1=new Panel(new GridLayout(2,2));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        add(p1);
        add(b1);
        b1.addActionListener(new TempEventHandler());
    }
    public class TempEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int num=Integer.parseInt(t1.getText()),rev=0,rem;
            while(num>0){
                rem=num%10;
                rev=rev*10+rem;
                num/=10;
            }
            t2.setText(""+rev);
        }
    }
    public static void main(String[] args) {
        new NumberReverser();
    }
}
