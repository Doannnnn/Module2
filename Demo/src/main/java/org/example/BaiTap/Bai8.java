package org.example.BaiTap;

import java.util.Arrays;

public class Bai8 {
    public static void main(String[] args) {
//        Bài 8: hiển thị các cột chẵn

        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {9,10,11,12}
        };
        colBarely(array);
//        printColEven(array);
    }
    public static void colBarely(int[][] array){
        for (int i = 0; i < array[0].length; i++){
            if (i % 2 == 0){
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j][i]);
                }
                System.out.println();
            }
        }
    }
}


