/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.util.Scanner;
/**
 *
 * @author riku
 */
public class GanarealCalc {
    Scanner scan=new Scanner(System.in);
    private int num1,num2,sum,diff,mul;
    public void setData(){
            System.out.print("Enter first num: ");
            num1=scan.nextInt();
            System.out.print("Enter second num: ");
            num2=scan.nextInt();
    }
    public void sum(){
        sum=num1+num2;
    }
    public void product(){
        mul=num1*num2;
    }
    public void difference(){
        diff=num1-num2;
    }
    public void displayData(){
        System.out.println("The sum is: "+sum+"\nThe difference is: "+diff+"\nThe product is: "+mul);
    }
    public static void main(String[] args) {
        GanarealCalc obj1= new GanarealCalc();
        obj1.setData();
        obj1.sum();
        obj1.product();
        obj1.difference();
        obj1.displayData();
    }
}
