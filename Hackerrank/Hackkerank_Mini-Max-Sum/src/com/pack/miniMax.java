package com.pack;

import java.util.Arrays;
import java.util.Scanner;

public class miniMax {

    static void miniMaxSum(int[] arr) {

        int sum;
        int min = 0;
        int max = 0;
        int temp;
        int count = 0;

       /* for(int i=0;i<arr.length; i++){
            sum +=arr[i];
        } */
        sum = Arrays.stream(arr).sum();

        for(int i=0;i<arr.length; i++){
            temp = sum - arr[count];
            if(i==0){
                min = temp;
                max = temp;
            }
            count++;
            min = Math.min(temp,min);
            max = Math.max(temp,max);
        }


        System.out.println(min+ " "+max);


    }
    private static final Scanner scanner = new Scanner(System.in);

    static public void main(String[] args){
        // Scanner scanner = null;
        System.out.println("enter s num");
        // int n = scanner.nextInt();
        //int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[]{1,2,3,4,5};

        System.out.println("arr : ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        miniMaxSum(arr);

        // scanner.close();
    }
}
