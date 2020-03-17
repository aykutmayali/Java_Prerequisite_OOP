package oop_lecture11;

public class Fish extends Animal{
    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming...");
    }

    public void swim(){System.out.println("swimming swimming ....");}
}
