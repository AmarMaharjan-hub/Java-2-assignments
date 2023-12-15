/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet4;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author riku
 */
public class InsertingImage {
    public InsertingImage(){
        JFrame f=new JFrame("ImageIcon demo");
        f.setSize(350,500);
        ImageIcon i1=new ImageIcon("D:/JAVA_Class/imagesForJava/javaLastImage.jpg");
        JLabel l1=new JLabel(i1);
        JLabel l2=new JLabel("Java Programming.");
        JLabel l3=new JLabel("Try it");
        JPanel p1=new JPanel(new FlowLayout());
        p1.add(l2);
        p1.add(l1);
        p1.add(l3);
        f.add(p1);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new InsertingImage();
    }
}
