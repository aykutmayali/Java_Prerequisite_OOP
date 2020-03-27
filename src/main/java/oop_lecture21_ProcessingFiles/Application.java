package oop_lecture21_ProcessingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException{
     //   System.out.println();
     //   System.in.
        System.out.println("Enter some text");
        Scanner input=new Scanner(System.in);
        String enteredText=input.nextLine();
        System.out.println(enteredText+"  entered now");

        try{
            File file=new File("myFile.txt");
            //File file=new File("myNoFile.txt");
            //  Scanner input=new Scanner(file);
            input=new Scanner(file);
            while(input.hasNextLine()){
                String line=input.nextLine();
                System.out.println(line);
            }
            input.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        MyFileUtils myUtil=new MyFileUtils();
        try {
            myUtil.subtract10FromLargerNumber(8);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
