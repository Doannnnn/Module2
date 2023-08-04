package org.example.BaiTap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo {
//    public static void main(String[] args) {
//        int[] [] array = {
//                {5,2,2,1},
//                {5,2,1,3},
//                {3,2,6,2},
//                {1,2,3,5},
//        };
//        System.out.println("[ ");
//        for (int i = 0; i < array.length; i++){
//            System.out.print("[");
//            for (int j = 0; j < array.length; j++){
//                if (j == array.length-1) {
//                    System.out.printf(array[i][j] + "]"+ "\n");
//                } else {
//                System.out.printf(array[i][j] + ",");}
//            }
//
//        }
//        System.out.print("]");
//        System.out.println(checkColsArr(array, 1));
//    }
//    public  static boolean checkArr(int [] array){
//        for (int i = 0; i < array.length-1; i++){
//            if (array[i] > array[i +1] ){
//                return false;
//            } else if (array[i] == array[array.length-1]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean checkColsArr(int[][] array, int cols) {
//        if (cols > array.length || cols < 0) {
//            return false;
//        } else if(cols < array.length) {
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i][cols] < array[i + 1][cols]) {
//                    return false;
//                } else if (array[0][cols] == array[array.length-1][cols]) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public static int largestSum(int[][] array){
//        int total = 0;
//        return total;
//    }
    public static void main(String[] args) {
        int[] array = {12,8,-3,9,-1,4,-5,7};
        increasingOddNumber(array);
        System.out.println(Arrays.toString(array));
    }
    public static void increasingOddNumber(int[] array){
        for (int i = 0; i < array.length - 1; i++){
           if (array[i] > 0){

           }
        }
    }
}
