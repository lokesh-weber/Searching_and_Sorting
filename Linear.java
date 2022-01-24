package com.lokesh;

public class Linear {

    public static void main(String[] args) {
	    int[] arr = {12 , 44 , 24 , 52 , 32};
        int target = 52;
        int ans = linear(arr , target);
        System.out.println(ans);
    }
    static int linear(int[] arr , int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {

            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
