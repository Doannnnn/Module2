package org.example.stackandqueue.daonguocphantu;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguocMangSo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        for (int j = 0; j < arr.length; j++){
            arr[j] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
