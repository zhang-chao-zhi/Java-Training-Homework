package com;

public class Input {
    public String answer(int number){
        // 游戏设置
        int rangeStart = 1;
        int rangeEnd = 8;
        int guessTotal = 5;

        // 游戏统计
        int totalGameCount = 0;
        int totalCorrectCount = 0;

        // 是否结束游戏
        boolean stopGame = false;

        while (!stopGame) {
            // 初始化本次游戏的变量
            int guessLeft = guessTotal;
            int mod = rangeEnd - rangeStart;
            double randNum = Math.random();
            int num = ((int) (randNum * rangeEnd * 100)) % mod;
            num += rangeStart;
            if (num <= rangeStart) {
                num = rangeStart + 1;
            }
            if (num >= rangeEnd) {
                num = rangeEnd - 1;
            }

            // 本次是否猜中数字
            boolean guessCorrect = false;
            while (guessLeft > 0) {
                if (number == num) {
                    return "恭喜你猜对了！这次的数字就是" + num;
                } else if (number > num) {
                    return "猜测的数字比目标数字大,继续猜";
                } else {
                    return "猜测的数字比目标数字小,继续猜";
                }
            }
            totalCorrectCount++;
            totalGameCount++;
            if (!guessCorrect) {
                return "本次的目标数字是" + num + "。这次没有猜中。" ;
            }
        }
        return "共进行了" + totalGameCount + "次游戏，其中正确的为" + totalCorrectCount + "次" ;
    }
}
