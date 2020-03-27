package oop_lecture22_fileReader;

import java.io.*;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
      //  File file=new File("myFile.txt");
        File file=new File("myWrongFile");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line= null;
        try {
            line = bufferedReader.readLine();
            while(line!=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Unable to close file ...");
            } catch (NullPointerException ex){
                System.out.println("file never opened " +ex);
            }
        }

    }
}
