package com.zhiwu.io;

import org.apache.commons.io.FileUtils;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能：文件输出流
 *
 * @author zhiwu
 * @Data 2024/6/28 23:04
 */
public class FileWrite {
    public static void main(String[] args) {
        String str = "hello world";

        try (FileOutputStream fos = new FileOutputStream("d:/test/test.txt", true)) {

            fos.write(str.getBytes());
            // 将内存中的数据保存到磁盘上
            fos.flush();
//            FileUtils.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
