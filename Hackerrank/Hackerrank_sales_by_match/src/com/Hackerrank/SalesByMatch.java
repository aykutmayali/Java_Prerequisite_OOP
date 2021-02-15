package com.Hackerrank;

import java.io.*;
import java.util.*;
import java.util.HashSet;

public class SalesByMatch {


        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {
            // n adet ten oluşan ar dizisi içinde aynı çiftler bulunup sayılması, bu çift sayıların geri döndürülmesi gerekli

            int count = 0;
            HashSet<Integer> socks = new HashSet<>();
            for(int i =0; i<n ; i++ ){
                if(socks.contains(ar[i]))
                {
                    count++;
                    socks.remove(ar[i]);
                }
                else
                    {
                    socks.add(ar[i]);
                }
            }
            return count;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
          /*
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt(); // enter number of array
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] ar = new int[n]; // creating an int array which has n elements

            String[] arItems = scanner.nextLine().split(" ");  // string array created
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arItems[i]); // string array içindeki elementler integer a dönüştürülüp
                ar[i] = arItem;     //  integer array içine tek tek atılır
            }

            int result = sockMerchant(n, ar); // sonuç sockMerchant fonksiyonuna n adet ve ar içerik dizisine göre döner

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();

           */
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number : ");
            //String s = br.readLine();
            //System.out.println("You entered "+s);
            int n = scanner.nextInt();
            System.out.println("You entered "+n);
            System.out.print("Enter an array of nums : ");
            int[] ar = new int[n];
            //String[] arItems = scanner.nextLine().split(" ");
            int arItems = scanner.nextInt();
            for (int i = 0; i < n; i++) {
               // int arItem = Integer.parseInt(arItems[i]); // string array içindeki elementler integer a dönüştürülüp
                ar[i] = arItems;     //  integer array içine tek tek atılır
            }
            int result = sockMerchant(n, ar);
            System.out.print("result of socks pair in array is "+ result);
        }

}
