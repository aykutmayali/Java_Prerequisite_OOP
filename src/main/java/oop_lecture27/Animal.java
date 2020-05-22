package oop_lecture27;

public class Animal {
    String name;
    int age;
    public Animal(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Animal [name="+name+" age="+age +"]";
    }

    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+age;
        result=prime*result+((name==null)?0:name.hashCode());
        return result;
    }
}
