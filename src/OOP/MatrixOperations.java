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
public class MatrixOperations {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{5,2,3,4,5},{6,7,8,9,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int sum = 0,max =0;
       MatrixHeadCubicle head = new MatrixHeadCubicle();
//       head.showMatrixRepresentation(matrix);
        for(int i =0; i<=matrix.length-3;i++){
            for (int j = 0; j < matrix.length-3; j++) {
                sum = sum+ matrix[i][j]+sum+ matrix[i+1][j+1]+sum+ matrix[i+2][j+2]+sum+ matrix[i+1][j+1]+ sum+ matrix[i+2][j]+sum+ matrix[i+2][j+1]+sum+ matrix[i+2][j+2];
            }
           if(max < sum){
               max = sum;
               sum =0;
           }
        }
            System.out.println("\t");
        
        }
//          System.out.println(sum);
    }
    

