/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author nazrul
 */
public class MatrixHeadCubicle {
    public int[][] allColomnWithSameValue(int[][] matrix){
          for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j;
                
            }
           
        }
    return matrix;
    }
     public int[][] allRowWithSameValue(int[][] matrix){
          for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i;
                
            }
           
        }
    return matrix;
    }
     public int[][] certainDifferenceMatrix(int[][]matrix){
         int inc = 1;
         int counter = matrix.length;
          for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter--;
                
            }
            counter = matrix.length*++inc;
           
        }
          return matrix;
     }
    public void showMatrixRepresentation(int[][] matrix){
          for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    
    }
    
}
