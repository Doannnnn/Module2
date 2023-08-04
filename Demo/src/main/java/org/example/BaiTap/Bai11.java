package org.example.BaiTap;

public class Bai11 {
    public static void main(String[] args) {
//        Bài 11: Tính tổng các số nguyên tố trong mảng 2 chiều

        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {6,1,4,2},
                {7,9,5,2}
        };
        System.out.println("tổng số nguyên tố trong mảng 2 chiều là: " + totalPrimeArr(array));
    }
    public static int totalPrimeArr(int[][] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i][j] >= 2){
                    int index = 2;
                    boolean flag = true;
                    while (index < array[i][j]){
                        if (array[i][j] % index == 0){
                            flag = false;
                            break;
                        }
                        index++;
                    }
                    if (flag){
                        total += array[i][j];
                        System.out.println(array[i][j]);
                    }
                }
            }
        }
        return total;
    }
}
