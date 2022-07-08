package com.readandwrite;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        WR wr = new WR();

        File targetFile = wr.createFile();

        wr.writeToFile(targetFile);

        wr.classicWay(targetFile);

        wr.coolerWay(targetFile);

        System.out.println("程序执行结束");
    }
}
