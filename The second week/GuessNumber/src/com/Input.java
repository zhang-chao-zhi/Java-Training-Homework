package com;

public class Input {
    public String result(int answer,int guessTotal) {

        // 游戏设置
        int rangeStart = 1;
        int rangeEnd = 8;

        // 初始化本次游戏的变量
        int mod = rangeEnd - rangeStart;
        double randNum = Math.random();
        int num = ((int) (randNum * rangeEnd * 100)) % mod;
        num += rangeStart;
        if (num <= rangeStart) {
            num = rangeStart + 1;
        } else {
            num = rangeEnd - 1;
        }

        // 本次是否猜中数字
        while (guessTotal > 0) {
            if (answer == num) {
                System.out.print("恭喜你猜对了！这次的数字就是" + num );break;
            } else if (answer > num) {
                return "猜测的数字比目标数字大,继续猜,剩余次数为" + guessTotal + "次";
            } else {
                return "猜测的数字比目标数字小,继续猜,剩余次数为" + guessTotal + "次";
            }
        }
        if (guessTotal == 0) {
            return "本次的目标数字是" + num + ",这次没有猜中。";
        }
        return ",游戏结束！";
    }
}