package oop_lecture11;

public class Fish extends Animal{
    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    public void swim(){System.out.println("swimming swimming ....");}
}
