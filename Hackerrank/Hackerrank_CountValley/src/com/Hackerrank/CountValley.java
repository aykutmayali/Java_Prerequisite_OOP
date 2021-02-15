package com.Hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountValley {
    static int countingValleys(int n,String s){
        int valleyCounter =0, altitude =0;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'U'){
                altitude++;
                if(altitude == 0){
                    valleyCounter++;
                }
            }else{
                altitude--;
            }
        }
        return valleyCounter;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter an array : ");
        //String[] arItems = scanner.nextLine().split(" ");
        String str = sc.next();
        System.out.println(countingValleys(n,str));
        sc.close();

    }
}
