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
   // Animal animal1=new Animal(3,"F",5); // abstract cannot be instanciated
   // Animal animal2=new Animal(1,"M",2);
    Bird birdy=new Bird(1,"M",1); //instance variable point to an object Bird ,variable type Bird
    Fish fishy=new Fish(1,"F",1);
  //  animal1.sleep();
  //  animal2.eat();
  //  birdy.fly();
    fishy.eat();
    birdy.sleep();
    Sparrow jack=new Sparrow(10,"M",2);
    jack.fly();
    Sparrow nick=new Sparrow(12,"M",2);
    nick.move();
    Animal mick= new Sparrow(3,"M",2);
    mick.move();
    Animal dory=new Fish(7,"F",20); // obj is type Fish , variable is type Animal
    dory.move();
    moveAnimal(mick);
    moveAnimal(dory);
    Flyable flyingBird =new Sparrow(1,"F",4);
    flyingBird.fly();
    
    }
   public static void moveAnimal(Animal animal){ // passing variable animal instance variable(dory) that is pointing to the object that will created when thiss app run into that method,
        animal.move(); // polymorphism
   }
}
