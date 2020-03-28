package oop_lecture22_fileReader;

import java.io.*;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
      //  File file=new File("myFile.txt");
        File file=new File("myWrongFile");
        //FileReader fileReader=new FileReader(file);
        //BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line= null;
        try( FileReader fileReader=new FileReader(file);
             BufferedReader bufferedReader=new BufferedReader(fileReader);
                )
        {
       /* try {
            line = bufferedReader.readLine();
            while(line!=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        */
            line = bufferedReader.readLine();
            while(line!=null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        } /*finally{
            try {
                if(bufferedReader !=null){
                    bufferedReader.close();
                }
                if(fileReader !=null){
                    fileReader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Unable to close file ...");
            } catch (NullPointerException ex){
                System.out.println("file never opened " +ex);
            }
        }
        */ //because of new kind try with resources are autoclosable no need more finally part here

    }
}
