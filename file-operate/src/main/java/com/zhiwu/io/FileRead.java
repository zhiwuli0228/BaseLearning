package com.zhiwu.io;

import java.io.FileInputStream;

/**
 * 功能：fileRead
 *
 * @author zhiwu
 * @Data 2024/6/28 22:28
 */
public class FileRead {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("d:/test/test.txt")) {
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            while ((temp = fileInputStream.read()) != -1) {
                sb.append((char) temp);
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
