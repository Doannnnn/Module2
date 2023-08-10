package org.example.demo;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
//        int[] arr = {3,2,4,6,7};
        int[] arr = {3,2,4,6,7, 11, 13, 8};
        int[] result = removePrimesFromArray(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removePrimesFromArray(int[] arr){
        int count= 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 2){
                int index = 2;
                boolean flag = true;
                while (index < arr[i]){
                    if (arr[i] % index == 0){
                        flag = false;
                        break;
                    }
                    index++;
                }
                if (!flag){
                    count++;
                }
            }
        }
        int[] newarr = new int[count];
        int k = 0;
        for (int j = 0; j < arr.length; j++){
            if (arr[j] >= 2){
                int index = 2;
                boolean flag = true;
                while (index < arr[j]){
                    if (arr[j] % index == 0){
                        flag = false;
                        break;
                    }
                    index++;
                }
                if (!flag){
                    newarr[k] = arr[j];
                    k++;
                }
            }
        }
        return newarr;
    }
}
