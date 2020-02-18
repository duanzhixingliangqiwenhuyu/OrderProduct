package com.util;

public class getMinIndex {

    //获取最小值索引
    public static int minIndex(double[] arr){
        int minIndex=0;; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }

}
