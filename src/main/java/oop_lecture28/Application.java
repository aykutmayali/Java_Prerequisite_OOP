package oop_lecture28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<Integer>();
        for (int i = 0; i <5 ; i++) {
            list1.add((i*2)+1);
        }
        ArrayList<Integer> newList=new ArrayList<Integer>();
        newList.add(10);
        newList.add(19);

        list1.addAll(newList);
        System.out.println(list1);

        List<Integer> li = new ArrayList<Integer>(list1);

        list1.removeAll(newList);
        System.out.println(list1);

        list1.clear();
        System.out.println(list1);
        System.out.println(li);

        HashSet<Integer> hashSet=new HashSet<Integer>(li);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(12);
        hashSet.add(21);
        System.out.println(hashSet);
    //    Collections.sort(hashSet); not generic type
        ArrayList<Integer> myList=new ArrayList<Integer>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);

        HashSet<Employee> hashSet1=new HashSet<Employee>();
        hashSet1.add(new Employee("musa",1500,"muhasebe"));
        hashSet1.add(new Employee("isa",1550,"muhasebe"));
        hashSet1.add(new Employee("tarik",1650,"ik"));
        hashSet1.add(new Employee("yunus",1750,"tasarım"));
        ArrayList<Employee> myList1= new ArrayList<Employee>(hashSet1);
        Collections.sort(myList1);
        System.out.println(myList1);

    }
}
