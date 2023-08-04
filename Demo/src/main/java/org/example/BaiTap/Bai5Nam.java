package org.example.BaiTap;

public class Bai5Nam {
    public static void main(String[] args) {
//        Bài 5: Kiểm tra mảng có giảm dần hay không

        int[] array = {9,8,7,6,5,4,};
        System.out.println(checkDecreaseArr(array));
    }
    public static boolean checkDecreaseArr(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i + 1]){
                return false;
            }
        }
        return true;
    }
}
