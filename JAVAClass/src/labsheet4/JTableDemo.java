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
public class JTableDemo extends JFrame{
    public JTableDemo(){
        setSize(600,400);
        setTitle("My window");
        setLayout(new GridLayout(1,1));
        String colHead[]={"Id","Name","Product","Price in $"};
        Object[][] data={{"1234","John","pencil","10"},
            {"4382","Mirian","pen","11"},
            {"2345","Katy","chair","253"},
            {"6334","Agnes","table","456"},
            {"1177","Stanley","flower","25"}
        };
        JTable tab=new JTable(data,colHead);
        JScrollPane sp=new JScrollPane(tab);
        add(sp);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTableDemo();
    }
}
