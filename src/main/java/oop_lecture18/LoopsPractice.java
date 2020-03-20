package oop_lecture18;

public class LoopsPractice {
    public static void main(String[] args){
        /*String name="lkdgkljfdlkgjklfjdgkljfdgjlkjoo";
        for (int i=0;i<name.length();i++){
            System.out.println("Characters one by one at name variable :"+name.charAt(i));
        }*/
        /*for(int i=name.length()-1;i>=0;i--){
            System.out.println("Characters one by one at name variable reversely :"+name.charAt(i));
        }
        for(int i=0;i<=100;i=i+2){
            System.out.println("Even nums between 0-100 are :"+i);
        }
        int counter =0;
        for(int i=0;i<=20;i++){
            System.out.println(i);
            int temp=counter+1;
            counter=temp;
        }*/
        int counter=0;
        for(int year=2000;year<=2097;year++){
            for(int month=1;month<=12;month ++){
                for(int day=1;day<=30;day ++){
                    counter++;
                    System.out.println("Day: "+day+" Month: "+month+" Year: "+year);
                }
            }
        }
        System.out.println("Counter :"+counter+" days");
    }
}
