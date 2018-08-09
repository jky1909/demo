package com.jky.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author jky
 * @date 2018/5/14 10:19
 */
public class Hello {
    public static void main(String[] args) {
        String fileName = "D:" + File.separator + "hello.txt";
        File file = new File(fileName);
        try {
            file.createNewFile();
            OutputStream out =new FileOutputStream(file);
            String str="你好";
            byte[] b=str.getBytes();
            out.write(b);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
