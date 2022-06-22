package com;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Input input = new Input();
        // 创建Scanner从控制台读取输入
        Scanner in = new Scanner(System.in);
        System.out.println("=================== 猜 数 字 游 戏===================");
        int guessTotal = 5;
        while (guessTotal > 0){
            int answer = in.nextInt();
            if(answer == -1){
                guessTotal = 0;
            } else {
                guessTotal--;
                String result = input.result(answer, guessTotal);
                System.out.println(result);
                if (result == ",游戏结束！") {
                    guessTotal = 0;
                }
            }
        }
    }
}