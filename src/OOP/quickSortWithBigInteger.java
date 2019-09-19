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
public class quickSortWithBigInteger {
  public static void quickSort(String [] unsorted,int low, int high){
        if(low >= high){
            return;
           
        }
         int partitionIndex = partitionArray(unsorted, low, high);
         quickSort(unsorted, low, partitionIndex-1);
         quickSort(unsorted, partitionIndex+1, high);
    }
    public static int partitionArray(String[]  unsorted, int low ,int high){
        int biggerThanPivotIndex = low;
        for (int i = low; i < high; i++) {
            if(new BigInteger(unsorted[i]).compareTo(new BigInteger(unsorted[high]))==-1){
                String temp = unsorted[i];
                unsorted[i] = unsorted[biggerThanPivotIndex];
                unsorted[biggerThanPivotIndex] = temp;
                biggerThanPivotIndex++;
            }
        }
        String temp = unsorted[high];
        unsorted[high] = unsorted[biggerThanPivotIndex];
        unsorted[biggerThanPivotIndex] = temp;
        return biggerThanPivotIndex;
    }
    public static void main(String[] args) {
        String unsorted[] = new String[]{"45","13","0","7865","5"};
        quickSort(unsorted,0,unsorted.length-1);
        for (String b : unsorted) {
            System.out.println(b);
        }
        
    }    
}
