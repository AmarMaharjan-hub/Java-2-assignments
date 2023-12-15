package labsheet4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CopyFromList extends JFrame{
    int count=0;
    String sel[]=new String[4];
    public CopyFromList(){
        setSize(600,200);
        setLayout(new FlowLayout());
        setTitle("Choose the color");
                
        String fruits[]={"apple","orange","banana","grapes","guava","mango","dragon fruit","watermelon"};
        JList<String> lst1=new JList<>();
//        JList<String> lst1=new JList<>(fruits);
        lst1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lst1.setVisibleRowCount(5);
        lst1.setFixedCellHeight(15);
        lst1.setFixedCellWidth(100);
        lst1.setListData(fruits);
        JScrollPane s1=new JScrollPane(lst1);
        JButton b1=new JButton("copy>>>");
        sel[0]=" ";
        JList<String> lst2=new JList<>(sel);
        lst2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        lst2.setVisibleRowCount(5);
        lst2.setFixedCellHeight(13);
        lst2.setFixedCellWidth(100);
        
        add(s1);
        add(b1);
        add(lst2);
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(count<4){
                    sel[count]=lst1.getSelectedValue();
                    lst2.setListData(sel);
                    count++;
                }
            }
        });
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new CopyFromList();
    }
}