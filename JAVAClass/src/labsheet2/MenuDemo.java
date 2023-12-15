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
public class MenuDemo extends Frame implements ActionListener{
    public MenuDemo(){
        setSize(500,300);
        setTitle("Menus Demo");
        setVisible(true);
        MenuBar mb=new MenuBar();
        setMenuBar(mb);
        
        Menu m1=new Menu("File");
        Menu m2=new Menu("Edit");
        Menu m3=new Menu("Run");
        Menu m4=new Menu("Source");
        Menu m5=new Menu("Refactor");
        Menu m6=new Menu("Search");
        Menu m7=new Menu("Project");
        Menu m8=new Menu("Windows");
        Menu m9=new Menu("Help");
        
        MenuItem mi1=new MenuItem("Open Project");
        MenuItem mi2=new MenuItem("Close Project");
        MenuItem mi3=new MenuItem("Build All");
        MenuItem mi4=new MenuItem("Build Project");
        
        m7.add(mi1);
        m7.add(mi2);
        m7.add(mi3);
        m7.add(mi4);
                
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        mb.add(m6);
        mb.add(m7);
        mb.add(m8);
        mb.add(m9);
    }
    public void actionPerformed(ActionEvent e){
    
    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}
