package org.example.textfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e){
            System.err.println("File khong ton tai");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter write = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(write);
            bufferedWriter.write("Gia tri lon nhat la: " + max);
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
