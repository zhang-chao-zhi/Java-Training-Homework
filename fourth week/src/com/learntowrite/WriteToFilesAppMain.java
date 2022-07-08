package com.learntowrite;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WriteToFilesAppMain {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        File targetFile = createFile();

        writeToFile(targetFile);

        System.out.println("程序执行结束");

    }

    private static void writeToFile(File targetFile) throws IOException {

        try (

            FileOutputStream fos = new FileOutputStream(targetFile);

            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

            PrintWriter pw = new PrintWriter(osw);
        ) {

            System.out.println("输入的内容会实时写入文件，如果输入空行则结束");
            while (true) {
                String lineToWrite = in.nextLine().trim();
                if (lineToWrite.trim().isBlank()) {
                    System.out.println("输入结束");
                    break;
                } else {
                    pw.println(lineToWrite);
                    pw.flush();
                }
                System.out.println("输入内容为" + lineToWrite);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static File createFile() throws IOException {
        System.out.println("请输入文件名：");
        String fileName = in.nextLine().trim();
        File f = new File("." + File.separator + fileName + ".txt");
        if (f.isFile()) {
            System.out.println("目标文件存在，删除：" + f.delete());
        }
        System.out.println(f.createNewFile());
        return f;
    }

}
