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
public class MenuOption extends JFrame{
    public MenuOption(){
        setSize(500,400);
        setTitle("JMenu Demo");
        JMenuBar mb=new JMenuBar();
        JMenu nm=new JMenu("Normal Menu");
        JMenu rm=new JMenu("Radio Menu");
        JMenu cm=new JMenu("Check Menu");
        JMenuItem newItem=new JMenuItem("New");
        JMenuItem openItem=new JMenuItem("Open");
        JRadioButtonMenuItem rb1=new JRadioButtonMenuItem("First Radio Option");
        JRadioButtonMenuItem rb2=new JRadioButtonMenuItem("Second Radio Option");
        JCheckBoxMenuItem cb1=new JCheckBoxMenuItem("First Check Option");
        JCheckBoxMenuItem cb2=new JCheckBoxMenuItem("Second Check Option");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        newItem.setIcon(new ImageIcon("D:/JAVA_Class/imagesForJava/newFile.jpg"));
        openItem.setIcon(new ImageIcon("D:/JAVA_Class/imagesForJava/openFile.jpg"));
        nm.add(newItem);
        nm.add(openItem);
        rm.add(rb1);
        rm.add(rb2);
        cm.add(cb1);
        cm.add(cb2);
        mb.add(nm);
        mb.add(rm);
        mb.add(cm);
        setJMenuBar(mb);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MenuOption();
    }
}
  