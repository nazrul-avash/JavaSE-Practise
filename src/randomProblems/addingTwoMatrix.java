/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline;

/**
 *
 * @author nazrul
 */
public class addingTwoMatrix {
    public static void main(String[] args) {
        int matrixOne[][]={{1,2,3},{4,5,6},{7,8,9}};
        int matrixTwo[][]={{1,2,3},{4,5,6},{7,8,9}};
        int matrixSum[][]=new int[matrixOne.length][matrixTwo[0].length];
    for(int i=0;i<matrixOne.length;i++){
    for(int j=0;j<matrixOne[i].length;j++){
     matrixSum[i][j]=matrixOne[i][j]+matrixTwo[i][j];
        System.out.print(" "+matrixSum[i][j]);
    }
        System.out.println("\n");
    }
    }
    
}
