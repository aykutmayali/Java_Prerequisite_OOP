package com.pack;

import java.util.Scanner;

public class staircase {
    static void staircase(int n) {
        String hashtag = "#";
        String space = " ,";
        String word = "";
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        // for direct increment
        /*
        for(int i = 0; i<n; i++){
            sb.append(hashtag);
            System.out.println(sb.toString());
        } */

        // for reverse increment
        /*       for(int i=0; i<n; i++){
            counter++;
            for(int k=n; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<=counter-1;j++ ){
                System.out.print("#");
            }
            System.out.print("\n");
        } */

        /*  for(int i = 0; i < n; i++)
        {
            sb.append(" ");
        }//Builds the a basic stair with no hashes

        for(int i = 1; i< n+1; i++)
        {
            sb.setCharAt(n-i,'#');
            System.out.println(sb);
        }//Makes a longer step each iteration */

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    static public void main(String[] args){
       // Scanner scanner = null;
        System.out.println("enter s num");
       // int n = scanner.nextInt();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("staircase : ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

       // scanner.close();
    }
}
