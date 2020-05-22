package oop_lecture27;

import java.util.HashSet;

public class Application {
    public static void main(String[] args){
      //  HashSet<Integer> values=new HashSet<Integer>();
      /*  LinkedHashSet<Integer> values=new LinkedHashSet<Integer>();// print in order of insertion
        values.add(11);
        values.add(21);
        values.add(31);
        values.add(41);
        values.add(31); */// only unique values in hashset an be printed
        HashSet<Animal> animals=new HashSet<Animal>();
        Animal animal1=new Animal("Cat",8);
        Animal animal2=new Animal("Bird",2);
        Animal animal3=new Animal("Dog",6);
        Animal animal4=new Animal("Donkey",5);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        System.out.println(animal1.equals(animal4));
        System.out.println(animal1.hashCode());
        System.out.println(animal4.hashCode());

        /*for (Integer value: values) {
            System.out.println(value);
        }*/
    }

}
