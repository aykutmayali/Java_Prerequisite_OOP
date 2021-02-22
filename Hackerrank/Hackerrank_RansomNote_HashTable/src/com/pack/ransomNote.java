package com.pack;

import java.util.Hashtable;

public class ransomNote {

    static void checkMagazine(String[] magazine, String[] note) {

        boolean condition = false;
     // for filling magazin hastable
        Hashtable<String, Integer> mht = new Hashtable<>();
        for(String m: magazine){
            if(mht.containsKey(m)){
                mht.put(m,mht.get(m)+1);
            } else {
                mht.put(m,1);
            }
        }

     // for filling notes hashtable
        Hashtable<String,Integer> nht = new Hashtable<>();
        for(String n: note){
            if(nht.containsKey(n)){
                nht.put(n,nht.get(n)+1);
            } else{
                nht.put(n,1);
            }
        }

        for(String key: nht.keySet()){
            if(!mht.containsKey(key) || mht.get(key)<nht.get(key)){
                condition = false;
                break;
            }
        }

        if(condition){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }


    public static void main(String[] args){

    }

}
