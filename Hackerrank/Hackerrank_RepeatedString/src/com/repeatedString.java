package com;

import java.io.IOException;
import java.util.Scanner;

public class repeatedString {
    static long repeatedString(String s, long n) {
        long res=0;
        long len= s.length();
        char[] repeated = new char[s.length()];
        long m = n/len;
        long art = n%s.length();

     /*   for(int i=0; i<m; i++){
            for(int j=0; j<len; j++){
                repeated[j] = s.charAt(j);
                if(repeated[j] == 'a'){
                    res++;
                }
            }

        }*/

        for(int j=0; j<len; j++){
            repeated[j] = s.charAt(j);
            if(repeated[j] == 'a'){
                res++;
            }
        }

        res *=m;

        if(art>0){
            for(int i=0; i<art ; i++){
                if(repeated[i] == 'a'){
                    res++;
                }
            }
        }


        return res;

    }

    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String str = sc.next();
        System.out.print("Enter a number : ");
        long b = sc.nextLong();
        System.out.println(" '^ a ' uses :");
        System.out.println(repeatedString(str,b));


    }

}
