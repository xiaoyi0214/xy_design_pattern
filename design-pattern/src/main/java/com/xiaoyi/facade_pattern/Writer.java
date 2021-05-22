package com.xiaoyi.facade_pattern;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void write(String encryptStr, String fileNameDes)
    {
        System.out.println("保存密文，写入文件。");
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter(fileNameDes);
            fileWriter.write(encryptStr);
            fileWriter.flush();
            fileWriter.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
