package com.pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class candles {
    static class Result {

        public static int birthdayCakeCandles(List<Integer> candles) {
            int temp = 0;
            int count = 0;
            int max = Integer.MIN_VALUE;
            for(int j=0; j<candles.size(); j++){
                temp = candles.get(j);
                max = Math.max(temp,max);
            }
            for(int i=0; i<candles.size(); i++){
                if(candles.get(i) == max){
                    count++;
                }

            }
            return count;
        }

    }


    private static final Scanner scanner = new Scanner(System.in);

    static public void main(String[] args){
        // Scanner scanner = null;
        System.out.println("entering program");
        // int n = scanner.nextInt();
        //int n = Integer.parseInt(scanner.nextLine());

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        //int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        //List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //        .map(Integer::parseInt)
        //        .collect(toList());
        List<Integer> candles = new ArrayList<Integer>(5);
        candles.add(10);
        candles.add(20);
        candles.add(30);
        candles.add(40);
        candles.add(40);
        int result = Result.birthdayCakeCandles(candles);

        //bufferedWriter.write(String.valueOf(result));

        //int[] arr = new int[]{1,2,3,4,5};

        System.out.println(result);
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      //  miniMaxSum(arr);

        // scanner.close();
    }
}
