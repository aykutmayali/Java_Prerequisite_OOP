/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lecture11;

/**
 *
 * @author LENOVA
 */
public class Zoo {
    public static void main(String[] args){
    Animal animal1=new Animal(3,"F",5);
    Animal animal2=new Animal(1,"M",2);
    Bird birdy=new Bird(1,"M",1);
    Fish fishy=new Fish(1,"F",1);
    animal1.sleep();
    animal2.eat();
  //  birdy.fly();
    fishy.eat();
    birdy.sleep();
    Sparrow jack=new Sparrow(10,"M",2);
    jack.fly();
    }
   
    
    
}
