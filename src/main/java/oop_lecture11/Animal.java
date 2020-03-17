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
public abstract class Animal {
    int age;
    String gender;
    int weight;
    
    public Animal(int age,String gender,int weight){
        this.age=age;
        this.gender=gender;
        this.weight=weight;
    }
    
    public void eat(){
        System.out.println("I am eating ...");
    }
    public void sleep(){
        System.out.println("rrrrrrrrr......");
    }
    public abstract void move();
}
