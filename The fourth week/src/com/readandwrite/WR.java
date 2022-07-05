package com.readandwrite;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WR implements Write,Read{

    private static final Scanner in = new Scanner(System.in);

    @override
    public File createFile() throws IOException {
        System.out.println("请输入文件名：");
        String fileName = in.nextLine().trim();
        File f = new File("." + File.separator + fileName + ".txt");
        if (f.isFile()) {
            System.out.println("目标文件存在，删除：" + f.delete());
        }
        System.out.println(f.createNewFile());
        return f;
    }

    @override
    public void writeToFile(File targetFile) throws IOException {

        try (

                FileOutputStream fos = new FileOutputStream(targetFile);

                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

                PrintWriter pw = new PrintWriter(osw);
        ) {

            System.out.println("输入的内容会实时写入文件，如果输入空行则结束");
            while (true) {
                String lineToWrite = in.nextLine().trim();
                if (lineToWrite.trim().isBlank()) {
                    System.out.println("写入完成，输出结果：");
                    break;
                } else {
                    pw.println(lineToWrite);
                    pw.flush();
                }
                System.out.println("输入内容为：" + lineToWrite);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @override
    public void classicWay(File sourceFile) throws IOException {
        System.out.println("---------经典的处理方式-------------");
        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr);
        ) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.trim().toUpperCase());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @override
    public void coolerWay(File sourceFile) throws IOException {
        System.out.println("---------更好的处理方式-------------");

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr);
        ) {
            reader.lines().map(String::trim).map(String::toUpperCase).forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
