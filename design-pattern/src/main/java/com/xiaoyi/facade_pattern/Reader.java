package com.xiaoyi.facade_pattern;

import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public String readFileToStr(String fileName){
        FileReader fileReader;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileReader = new FileReader(fileName);
            char[] ch = new char[1024];
            while((fileReader.read(ch,0,512))!=-1){
                stringBuilder.append(ch);
            }
            fileReader.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
