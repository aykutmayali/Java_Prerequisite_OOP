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
public class Bird extends Animal {
    public Bird(int age,String gender,int weight){
        super(age,gender,weight);
    }
    public void fly(){
        System.out.println("I can fly , bye ...");
    }
}