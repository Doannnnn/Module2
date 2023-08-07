package org.example.BaTapi3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai14 {
    public static void main(String[] args) {
//        Bài 14: Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử

        int[] array = {1,3,9,5,7,5,9,3,1,1,1,1};
        int[] result = eraseElementDuplicateArr(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] eraseElementDuplicateArr(int[] array){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
           if (!list.contains(array[i])) {
               list.add(array[i]);
           }
        }
        int[] newarray= new int[list.size()];
        int i = 0;
        for (int item: list) {
            newarray[i] = item;
            i++;
        }
        return newarray;
    }
}
