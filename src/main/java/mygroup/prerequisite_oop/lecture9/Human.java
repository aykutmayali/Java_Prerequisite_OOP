/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygroup.prerequisite_oop.lecture9;

/**
 *
 * @author LENOVA
 */
public class Human {
    String name;
    int age;
    int height;
    String eyeColor;
    
    public Human(){ //Human Constructor
        age=25;
        eyeColor="purple";
        height=175;
        name="Aykut";
    }
    
    public void speak(){
        System.out.println("Hello my name is "+name);
        System.out.println("I am "+ age+" years old");
    }
    public void eat(){
        System.out.println("eating....");
    }
    public void walk(){
        System.out.println("walking ...");
    }
    
}
