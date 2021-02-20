package com.pack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class leftrotation {
    static int[] rotLeft(int[] a, int d) {
        int len = a.length;
        int [] shiftedArray = new int[a.length];
        int rotate_index = d;
        int i=0;

        while(rotate_index<len){
            shiftedArray[i] = a[rotate_index];
            i++;
            rotate_index++;
        }
        rotate_index =0;
        while (rotate_index<d){
            shiftedArray[i] = a[rotate_index];
            i++;
            rotate_index++;
        }
        return shiftedArray;

        //System.arraycopy(a, d,shiftedArray,0,len-d);
        //System.arraycopy(a,0,shiftedArray,len-d, d);

        return shiftedArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        System.out.println("enter two num :");
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        System.out.println("enter array :");
        //String[] nd = scanner.nextLine().split(" ");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        System.out.println("Array 3rd : "+ a[3]);

        int[] result = rotLeft(a, d);


        System.out.println(result[3]);

        System.out.println("end of line");

        scanner.close();


    }


}
