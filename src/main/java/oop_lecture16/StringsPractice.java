package oop_lecture16;

public class StringsPractice {
    public static void main(String[] args){
        String a="hello";
        System.out.println(a.length());
        String str="ABCDEFG";
        String extractedString=str.substring(2);//cut f,rst 2 char
        System.out.println(extractedString);
        extractedString=str.substring(1,3);// between 1&3=1+2
        System.out.println(extractedString);

        String b="there";
        if(a == "hello"){
            System.out.println("a==hello");
        }
        if(a.equals("hello")){
            System.out.println("a.equals('hello')");
        }
        if(!a.equals("hello")){
            System.out.println("a.equals('hello')");
        }
        if(b.equalsIgnoreCase("There")){
            System.out.println("b.equals without capitalLetter 'There'");
        }

        System.out.println(b.charAt(3)); //only 3. char displayed
        System.out.println(a.charAt(2));
        str="Hello there someone";
        int strInt= str.indexOf("there");
        System.out.println("starting place of 'there' in str is :"+ strInt);
        str="Hello there someone there";
        strInt=str.indexOf("there",8);
        System.out.println("second 'there' place from 8.th char : "+strInt);
        int c=str.lastIndexOf("there");
        System.out.println(" address of 'there ' from reverse of sentence is "+c);

    }
}
