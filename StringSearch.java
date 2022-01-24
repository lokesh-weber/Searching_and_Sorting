package com.lokesh;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Lokesh";
        char target = 'k';
        System.out.println(strSearch(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean strSearch2(String name, char target ) {
        if(name.length() == 0){
            return false;
        }
        for (char ch : name.toCharArray()){
            if( ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean strSearch(String name, char target ) {
        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++)
            if (target == name.charAt(i)) {
                return true;
            }
        return false;
    }
}
