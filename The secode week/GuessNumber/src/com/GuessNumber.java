package com;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Input input = new Input();
        // 创建Scanner从控制台读取输入
        Scanner in = new Scanner(System.in);
        System.out.println("=================== 猜 数 字 ===================");
        while (true){
            int number = in.nextInt();
            String answer = input.answer(number);
            System.out.println(answer);
        }
    }
}
