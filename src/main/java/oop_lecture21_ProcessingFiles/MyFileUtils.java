package oop_lecture21_ProcessingFiles;

public class MyFileUtils {
   public int subtract10FromLargerNumber(int num) throws Exception{
       if (num<10){
           throw new fooRunTimeException("The number smaller than 10");
       }
       return -10;
   }
   public class fooRunTimeException extends Exception{
       public fooRunTimeException(String message){
           super(message);
       }
   }
}
