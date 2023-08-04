package org.example.BaiTap;

public class Bai6Sau {
    public static void main(String[] args) {
//        Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không

        int[] array1 = {1,3,4,6,7,8,11,15,17};
        int[] array = {1,3,4,21};
        System.out.println(checkValueArr(array, array1));
    }
    public static boolean checkValueArr(int[] array, int[] array1){
        for (int i = 0; i < array.length; i++){
            boolean flag = false;
            for (int j = 0; j < array1.length; j++){
                if (array1[j] == array[i]){
                    flag = true;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
