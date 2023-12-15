/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
/**
 *
 * @author riku
 */
public class Dog {
    private int age;
    private String name,color;
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void printAll(){
        System.out.println("Properties of dog:\nName : "+name+"\nAge : "+age+"\nColor : "+color);
    }
    public static void main(String[] args){
        Dog obj1=new Dog();
        obj1.setName("Tom");
        obj1.setColor("White");
        obj1.setAge(5);
        obj1.printAll();
    }
}
