package com.pack;

public class Palindrome {

    public static boolean isPalindromeString(String text) {
        String reverse = reverse(text).toLowerCase();
        if(text.toLowerCase().equals(reverse)){
            return true;
        } else {
            return false;
        }

    }

    public static String reverse(String input) {
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0,input.length()-1));
    }

    public static void main(String[] args){
        System.out.println("Kayak Palindrome ?");
        System.out.println(isPalindromeString("Kayak"));

        System.out.println("ANNA Palindrome ?");
        System.out.println(isPalindromeString("ANNA"));

        System.out.println("Karma Palindrome ?");
        System.out.println(isPalindromeString("Karma"));
    }

}
