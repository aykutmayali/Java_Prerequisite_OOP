package oop_lecture17;

public class LooppsPractice {
    public static void main(String[] args) {
        String str="We have a large inventory of things in our warehouse falling in"+
                "the category:apperal and the slightly"+
                "more in demand category:makeup along with the category:furniture and --";

        countNumber(45);
        findWord(str,"category");
        printCategories(str);
    }
        public static void countNumber(int x){
            while (x <= 50) {
                System.out.println("1-50 , x:" + x);
                x++;
                if (x == 30) {
                    //    break;
                    continue;
                }
            }
        }
        public static void findWord(String string,String searchedWord){
            int number=0;
            while(true){
                number=string.indexOf(searchedWord,number);
                if(number == -1) break;
                number++;
                System.out.println("Place of the word "+searchedWord+" is :"+number);

            }
        }
        public static void printCategories(String string){
            int number=0;
            while (true){
                number=string.indexOf("category",number);
                if(number == -1) break;
                number++;
                int startof=number+8;
                int endof=string.indexOf(" ",startof);
                String cats=string.substring(startof,endof);
                System.out.println("Name of the category is :"+cats);
            }
        }
}
