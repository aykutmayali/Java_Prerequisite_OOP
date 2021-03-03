package com.pack;

import java.util.List;
import java.util.Scanner;

public class plusMinus {

    static void plusMinus(int[] arr) {
        float len = arr.length;
        float pos = 0.0F;
        float neg =0.0F;
        float zero =0.0F;

        for(int i=0; i<len; i++){
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i]> 0){
                pos++;
            }
            if(arr[i]< 0){
                neg++;
            }
        }

        float posr = (pos) / len;
        float negr = (neg) / len;
        float zeror = (zero) / len;

        System.out.println(posr);
        System.out.println(negr);
        System.out.println(zeror);
    }

    private static final Scanner scanner = new Scanner(System.in);

    static public void main(String[] args){
        // Scanner scanner = null;
        System.out.println("entering ...");
        // int n = scanner.nextInt();
        //int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[]{-4, 3, -9, 0, 4, 1};

        System.out.println("arr : ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        plusMinus(arr);

        // scanner.close();
    }


}
