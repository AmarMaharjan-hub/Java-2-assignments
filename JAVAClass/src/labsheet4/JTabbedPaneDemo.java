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
public class JTabbedPaneDemo extends JFrame{
    public JTabbedPaneDemo(){
        setSize(500,500);
        JTabbedPane tp=new JTabbedPane();
        tp.add("Dashboard",new DashBoard());
        tp.add("Courses",new Courses());
        tp.add("Comment",new Comment());
        add(tp);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTabbedPaneDemo();
    }
}
class DashBoard extends JPanel{
    DashBoard(){
        JLabel l1=new JLabel("Welcome to IOC");
        add(l1);
    }
}
class Courses extends JPanel{
    Courses(){
        JLabel l1=new JLabel("Select the course");
        JCheckBox c1=new JCheckBox("C");
        JCheckBox c2=new JCheckBox("C++");
        JCheckBox c3=new JCheckBox("Java");
        JCheckBox c4=new JCheckBox("PHP");
        setLayout(new GridLayout(6,1));
        JButton b1=new JButton("submit");
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b1);
    }
}
class Comment extends JPanel{
    Comment(){
        JLabel l1=new JLabel("Leave your Comment");
        JTextArea t1=new JTextArea(25,40);
        add(l1);
        add(t1);
    }
}
