package com.zhiwu.io;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * 功能：使用缓冲区进行文件复制
 *
 * @author zhiwu
 * @Data 2024/6/28 23:30
 */
@Slf4j
public class BufferCopy {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        copyFileByBuffer("d:/test/1.jpg", "d:/test/2.jpg");
        long end = System.currentTimeMillis();
        log.info("copy file cost {} mills" ,end - start);

    }

    private static void copyFile(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int temp = 0;
            while ((temp = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, temp);
            }
            fos.flush();
        } catch (IOException e) {
            log.error("operate file failed");
        }
    }

    private static void copyFileByBuffer(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            int temp = 0;
            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
            bos.flush();
        } catch (IOException e) {
            log.error("operate file failed");
        }
    }
}
