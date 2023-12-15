/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author riku
 */
public class StudentForm extends JFrame{
    public StudentForm(){
        setSize(600,400);
        setLayout(new GridLayout(2,1));
        setTitle("Student Info Form");
        
        JLabel l1=new JLabel("Name:");
        JLabel l2=new JLabel("Address:");
        JLabel l3=new JLabel("Gender:");
        JLabel l4=new JLabel("Program:");
        JLabel l5=new JLabel("Phone:");
        JLabel l6=new JLabel("Email:");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JTextField t4=new JTextField();
        JButton b1=new JButton("Add");
        JButton b2=new JButton("Reset");
        JButton b3=new JButton("Cancel");
        JRadioButton rb1=new JRadioButton("male",true);
        JRadioButton rb2=new JRadioButton("female");
//        JRadioButton rb3=new JRadioButton("notSelected",true);
//        JRadioButton rb3=new JRadioButton("male");
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
//        bg1.add(rb3);        
        String course[]={"BIM","Bsc.CSIT","BCA","BBA","BBM"};
        JComboBox<String> cb1=new JComboBox(course);
        JPanel p1=new JPanel(new GridLayout(6,2));
        JPanel p2=new JPanel(new FlowLayout());
        JPanel p3=new JPanel(new FlowLayout());
//        p2.add(rb3);
//        rb3.setVisible(false);
        p2.add(rb1);
        p2.add(rb2);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(p2);
        p1.add(l4);
        p1.add(cb1);
        p1.add(l5);
        p1.add(t3);
        p1.add(l6);
        p1.add(t4);
        add(p1);
        add(p3);
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String gender=";";
                if(rb1.isSelected()){
                    gender=rb1.getText();
                }else if(rb2.isSelected()){
                    gender=rb2.getText();
                }else{
                    gender="Not Selected";
                }
                JOptionPane.showMessageDialog(null,"name: "+t1.getText()+"\nAddress: "+t2.getText()+"\nGender: "+gender+"\nProgram: "+cb1.getSelectedItem()+"\nPhone: "+t3.getText()+"\nEmail: "+t4.getText());
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                cb1.setSelectedIndex(0);
                
                rb1.setSelected(true);
//If the radio button not selected at the beginnning and when the reset button has been clicked if any selected then
//deselect the radio button as in the beginning...
/*
                **You can create rb3 as ...new RadioButton("not selected",true);
                **Add rb3 to the same button group.Do not add it in the JFrame.When the reset button is clicked do the 
                **following:

                rb3.setSelected(true);
*/
/*
                **Create rb3 as ...new RadioButton("male");
                **Add to the button group.
                **Add to the frame.
                **set rb3 visible to false.
                **When reset button is clicked do the following:

                rb1.setSelected(true);
                rb1.setVisible(false);
                rb3.setVisible(true);
*/
//Both methods works. But presenting unselected radiobutton at the beginning and resetting radiobutton to like 
//they're not selected is not a good pratice nor is recommended.
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new StudentForm();
    }
}