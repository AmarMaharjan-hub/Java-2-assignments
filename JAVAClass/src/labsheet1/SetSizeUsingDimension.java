/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet1;
import java.awt.*;
/*
 *
 * @author riku
 */
public class SetSizeUsingDimension {
  public SetSizeUsingDimension(){
      Frame f=new Frame("My First GUI Program");
      Dimension d=new Dimension(600,400);
      f.setSize(d);
      f.setLayout(null);
      f.setVisible(true);
  }  
  public static void main(String[] args){
      SetSizeUsingDimension obj1=new SetSizeUsingDimension();
  }
}
