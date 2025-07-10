package Search_Algorithms;

import Data_Structures.LinkedLIsts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
 private final static Logger log = LoggerFactory.getLogger(Main.class);
 public static int[] A;
private static LinkedLIsts name_hud;
 public Main(int n){

 }
    public static void main(String[] args) {
 //fuzzBuzz();
    //int [] array = new int[] {2,5,6,7,8,8,2};
     //System.out.println(contain_Duplicates(array));
     /*for (int counter = 1; counter <= 7; counter++){
         //System.out.printf("%d! = %d\n",counter,recFactorial(counter));
         System.out.println(isArrayInSortedOrder(array,counter));
     }*/

     //int n = 4;
    // int k = 2;
  //   A = new int[n];
//     binary(n);

  //trace(0);
   //     generateBinary(2,"");
     //   K_strings(n,k);
        name_hud = new LinkedLIsts();
        name_hud.hud();

}
private static void fuzzBuzz(){
        int[] number = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,15,18,25,44,103,120,150,500};
        for (int num : number) {
            if (num % 15 == 0){
                //  System.out.println(num+" fizz buzz");
                log.info(num+" fizz buzz");
            }
            else if (num % 3 == 0){
                //System.out.println(num + " fizz");
                log.info(num + " fizz");
            }
            else if (num % 5 == 0) {
                //System.out.println(num+" buzz");
                log.info(num + " buzz");
            }

            else {
                //System.out.println(num);
                log.info(num+"");

            }
        }
    }

private static int find_Max(int[] nums){
    int max = nums[0];
    for(int index = 1; index<nums.length;index++){
        if (max < nums[index]) {
            max=nums[index];
        }
    }
    return max;
}
     private static int contain_Duplicates(int[] nums){
     int total_dublicates =0;
         int dublicates_count=0;
     for (int i = 0; i < nums.length - 1; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] == nums[j]) {
                     dublicates_count +=1;
                 } if (!(dublicates_count % 2 == 0)) {
                     total_dublicates = dublicates_count-1;

                 } else {
                     total_dublicates=dublicates_count;
                 }
             }
         }
         return total_dublicates;
     }
private static long recFactorial(long number){
     if (number<=1) return 1;
     else return number * recFactorial(number-1);
}
private static int returnZero(int number){
     if (number == 0) return 0;
     else {
         //System.out.println(number);
         return returnZero(number-1);
     }

}
private void TowerOfHanoi(int n, char frompeg,char topeg,char auxpeg){
if (n==1){
    System.out.println("Move disk 1 from peg" + frompeg + "to peg" + topeg);
    return;
}
/*NOTE A is left C is the middle and B is right*/
/*Move top n-1 disks from A to B,using C as reserve */
    TowerOfHanoi(n-1, frompeg,auxpeg,topeg);
    /*Move n-1 disks from B to C using A as auxiliary*/
    TowerOfHanoi(n-1,auxpeg,topeg,frompeg);
}
private static int isArrayInSortedOrder(int[] A, int index){
    if (A.length == 1 || index == 1) return 1;
    return (A[index-1] < A[index-2]?0 : isArrayInSortedOrder(A,index-1));
    }
private static void binary(int n){
     if (n <= 0) System.out.println(Arrays.toString(A));
     else {
         A[n-1] = 0;
         binary(n-1);
         A[n-1] = 1;
         binary(n-1);
     }
}
//backtracking example
private static void trace(int n){
     if (n>3) return;
     System.out.println("Down the stack:" + n);
     trace(n+1);
     System.out.println("Backtracking the stack:" + n);
}
private static void generateBinary(int n ,String current){
     if (current.length() == n){
         System.out.println(current);
         return;
     }
     generateBinary(n,current+"0");
     generateBinary(n,current+"1");
}
private static void K_strings(int n, int k){
     if (n<=0){
         System.out.println(Arrays.toString(A));
     }
     else {
         for (int j = 0; j < k; j++ ){
             A[n-1] = j;
             K_strings(n-1,k);
         }
     }
}


 }

