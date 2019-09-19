/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author nazrul
 */
public class mostOccurrencesOfNumber {
public static int mostOccurence(int [] nums){

int numerator=0;
int res=0;
for(int i=0;i<nums.length;i++){
    int count=0;
for(int j=0;j<nums.length;j++){
if(nums[i]==nums[j]){
count++;
}

}
    System.out.println(count);
if(count>=numerator){
res=nums[i];
    numerator=count;


        
}
}
return res;
}    
    public static void main(String[] args) {
        int arr[]={45,7,85415,65,4,84,4,4,54,5755,2,2454,141,574,1,48745};
        System.out.println(mostOccurence(arr)); 
    }
}
