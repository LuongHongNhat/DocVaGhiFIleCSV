package org.example;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFile {
     public static String readFileAsString(String fileName)throws Exception

        {
            String data = "";
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            return data;
        }
        public static void main(String[] args) throws Exception

        {
            String data = readFileAsString("C:\\Users\\nhatlh2\\Desktop\\VERSION_CHUAN.csv");
            String[] array = data.split("\r\n");
//            System.out.println(array);

            ArrayList<Infor> lstInfor = new ArrayList<>();// nhiều Infor
            Infor new_Infor = new Infor();

            for (int i = 1; i < array.length; i++) {
                String[] splidedData = array[i].split(",");
                new_Infor.addDataToArrayList(splidedData);
                lstInfor.add(new_Infor);
            }
            for (int i = 0; i < lstInfor.size(); i++) {
                System.out.println("Thông tin voucher thứ " + (i +1) +"\n "+ lstInfor.get(i).toString());
            }

        }


}
