package org.example.BaiTap1;

public class Bai10 {
    public static void main(String[] args) {
//        Bài 10: Tìm ra vị trí [i,j] của số chẳn đầu tiên

        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {6,1,4,2},
                {7,9,5,2}
        };
        findLocation(array);
    }
    public static void findLocation(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i][j] % 2 == 0){
                    System.out.println("Vị trí [" + i + ", " + j + "] số chẳng đầu tiên là: " + array[i][j]);
                    return;
                }
            }
        }
    }
}
