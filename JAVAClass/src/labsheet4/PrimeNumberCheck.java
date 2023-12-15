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
public class PrimeNumberCheck extends Frame{
    TextField t1,t2;
    public PrimeNumberCheck(){
        setSize(400,200);
        setVisible(true);
        setTitle("Prime Number Test");
        setLayout(new GridLayout(2,1));
        Label l1=new Label("Number");
        Label l2=new Label("Prime");
        t1=new TextField();
        t2=new TextField();
        t2.setEnabled(false);
        Button b1=new Button("Check");
        Panel p1=new Panel(new GridLayout(2,2));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        add(p1);
        add(b1);
        b1.addActionListener(new ActionEventHandler());
    }
    public class ActionEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int num=Integer.parseInt(t1.getText());
            boolean result=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    t2.setText("No");
                    result=false;
                    break;
                }
            }
            if(result){
                t2.setText("Yes");
            }
        }
    }
    public static void main(String[] args) {
        new PrimeNumberCheck();
    }
}
