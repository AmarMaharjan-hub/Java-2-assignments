/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;
import java.awt.*;
import java.awt.event.*;
public class ArmstrongChecker extends Frame{
    TextField t1;
    Label l1,l2;
    public ArmstrongChecker(){
        setSize(600,100);
        setVisible(true);
        setTitle("Armstrong Checker");
        setLayout(new FlowLayout());
        l1=new Label("Number");
        l2=new Label();
        l2.setPreferredSize(new Dimension(100,20));
        Button b1=new Button("Check");
        t1 = new TextField(10);
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        b1.addActionListener(new TempEventHandler());
    }
    public class TempEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int num=Integer.parseInt(t1.getText()),rem,temp=num;
            double sum=0;
            while(num>0){
                rem=num%10;
                sum=sum+(Math.pow(rem,3));
                num/=10;
            }
            if(temp==sum){
                l2.setText("It is Armstrong.");
            }else{
                l2.setText("It is not Armstrong.");
            }
        }
    }
    public static void main(String[] args) {
        new ArmstrongChecker();
    }
}
