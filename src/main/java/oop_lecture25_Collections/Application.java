package oop_lecture25_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args){
       // ArrayList words=new ArrayList();
        ArrayList<String> words=new ArrayList<String>();
        words.add("hello");
        words.add("there");
       // words.add(10);
        words.add("10");
     //   words.add(9);
     //   words.add(12.00);
     //   words.add('H');

        String item1= (String) words.get(0);
        String item2= (String) words.get(1);
        Object item3=words.get(0);
        Object item4=words.get(1);
       // int item5=(int) words.get(2);
       // int item6=(int) words.get(3);
       // System.out.println(item5+item6);

        LinkedList<Integer> numbers=new LinkedList<Integer>();
        numbers.add(100);
        numbers.add(1000);
        numbers.add(35);
        numbers.add(200);
        numbers.remove(); //first one removed
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
