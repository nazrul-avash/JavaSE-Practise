/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.math.BigInteger;

/**
 *
 * @author nazrul
 */
public class MergeSortWithBigInteger {
     public static void mergeSort(String []unsorted, int low, int high){
        if(low >= high){
            return;
        }
        else{
            int mid = (high+low)/2;
            mergeSort(unsorted, low, mid);
            mergeSort(unsorted, mid+1, high);
            merge(unsorted, low, mid, high);
        }
    }
    public static void merge(String []unsorted,int low,int mid,int high){
    int index=0;
    String temp[] = new String[(high-low+1)];
    int leftIndex = low;
    int rightIndex = mid+1;
    while(leftIndex <= mid && rightIndex <= high){ 
        BigInteger leftBig = new BigInteger(unsorted[leftIndex]);
        BigInteger rightBig = new BigInteger(unsorted[rightIndex]);
        if(leftBig.compareTo(rightBig)==-1){
            temp[index++] = unsorted[leftIndex++];
        }
        else{
            temp[index++] = unsorted[rightIndex++];
        }
    }
    while(leftIndex <= mid){
        temp[index++] = unsorted[leftIndex++];
    }
    while(rightIndex <= high){
        temp[index++] = unsorted[rightIndex++];
    }
    index = 0;
    for (int i = low; i <= high; i++) {
            unsorted[i] = temp[index++];
        }
    }
    public static void main(String[] args) {
        String [] unsorted = new String[]{"789","78121","5","654123","0"};
        mergeSort(unsorted,0, unsorted.length-1);
        for (String b : unsorted) {
            System.out.print(b+" ");
        }
    }
    
    
}
