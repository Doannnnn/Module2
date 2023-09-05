package org.example.textfile.coppyfile;

import java.io.*;
import java.lang.annotation.Target;

public class FileCopyExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Nhập tên tệp nguồn: ");
            String sourceFile = reader.readLine();
            File file = new File(sourceFile);
            if (!file.exists()){
                System.out.println("File không tồn tại");
                return;
            }
            System.out.println("Nhập tên tệp đích");
            String tagetFile = reader.readLine();
            File target = new File(tagetFile);
            if (target.exists()){
                System.out.println("File không tồn tại");
                return;
            }
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(tagetFile);
            int character;
            int numCharacter = 0;
            while ((character = fis.read()) != -1){
                fos.write(character);
                numCharacter++;
            }
            fis.close();
            fos.close();
            System.out.println("Số ký tự trong tệp: " + numCharacter);
        } catch (IOException e){
            System.out.println("Đã xảy ra lỗi trong quá trình sao chép tệp");
        }

    }
}
