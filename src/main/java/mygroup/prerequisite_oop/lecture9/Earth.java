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
public class Earth {
    public static void main(String args[]){
        Human tom; //create variable type Human 
        tom = new Human(); // assing variable new Human object ,object created at this statement
        tom.name="tom";
        tom.age=35;
        tom.eyeColor="brown";
        tom.speak();
        tom.eat();
        
        Human human1=new Human();
        human1.speak();
        human1.walk();
    }
    
}
