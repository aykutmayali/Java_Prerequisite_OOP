package com.example.helloworld;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

class Result {

    static List<String> days;

    static {
        days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
    }


    public static String findDay(int month, int day, int year) {
      //  int y = Integer.parseInt(year);
      //  int m = Integer.parseInt(month);
      //  int d = Integer.parseInt(day);
        int y = year;
        int m = month;
        int d = day;

        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d);

        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);
        return s;
    }

}


public class HelloWorld {
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);
        int yy = Integer.parseInt(year);

        System.out.println(Result.findDay(mm, dd,yy ));

    }
}
