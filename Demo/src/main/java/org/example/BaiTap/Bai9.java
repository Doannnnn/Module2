package org.example.BaiTap;

public class Bai9 {
    public static void main(String[] args) {
//        Bài 9: Tính tổng các giá trị đường viền

        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {6,1,4,2},
                {7,9,5,2}
        };
        System.out.println(totalValueBorder(array));
    }
    public static int totalValueBorder(int[][] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            if (i == 0 || i == array.length - 1) {
                for (int j = 0; j < array.length; j++) {
                    total += array[i][j];
                }
            } else {
                total += array[i][0];
                total += array[i][array.length - 1];
            }
        }
        return total;
    }
}
