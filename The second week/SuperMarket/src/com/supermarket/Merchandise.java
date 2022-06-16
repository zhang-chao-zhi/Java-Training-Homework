package com.supermarket;

public class Merchandise {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    // >> TODO 访问修饰符
    // >> TODO 返回值类型：无需返回值则用void表示，void是Java中的关键字
    // >> TODO 方法名：任意合法的标识符都可以
    // >> TODO 参数列表：后续讲解
    // >> TODO 方法体：方法的代码
    // >> TODO 方法体内部定义的变量叫做局部变量
    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。赠品是" + gift.name + "。价值" + gift.purchasePrice);
    }


    // >> TODO 在方法定义中指定方法的返回值类型
    // >> TODO Java中一个方法只能有一种返回值，如果不需要返回值则用void表示
    // >> TODO 如果定义了返回值，则必须使用 return 语句返回方法的返回值，return 是 Java 的关键字
    // >> TODO 可以认为，返回值必须要能够用来给返回值类型的变量赋值
    public double calculateProfit(){
        double profit = soldPrice - purchasePrice;
        // >> TODO 这个return是代码块里的return，是return所在代码块的最后一个语句
        if (profit <= 0) {
            return 0;
        }
        //  >> TODO return 语句必须是所在代码块的最后一个语句，否则就是语法错误
        return profit;

        // >> TODO 一个方法可以有多个返回语句。
    }


    // >> TODO 参数是定义在方法名字后面的括号里的
    // >> TODO 参数定义的规范和变量一样，都是类型名字加标识符，这里的标识符我们叫做参数名。
    // >> TODO 方法体中的代码可以使用参数
    // >> TODO 参数的值在调用方法的时候需要给出，有的资料叫做实参（实际参数）
    // >> TODO 对应的，方法定义这里的参数，叫做形参（形式参数）
    public double buy(int countToBuy) {
        if (count < countToBuy) {
            System.out.println("商品库存不够");
            return -1;
        }

        System.out.println("商品单价为" + purchasePrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = purchasePrice * fullPriceCount + halfPriceCount * purchasePrice / 2;

        count -= countToBuy;

        return totalCost;
    }

    // >> TODO 一个方法可以有多个参数，多个参数之间用逗号隔开
    public double buyAndPrintLeft(int countToBuy, boolean printLeft) {
        if (count < countToBuy) {
            System.out.println("商品库存不够");
            if (printLeft) {
                System.out.println("商品剩余库存为" + count);
            }
            return -1;
        }

        System.out.println("商品单价为" + purchasePrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = purchasePrice * fullPriceCount + halfPriceCount * purchasePrice / 2;

        count -= countToBuy;

        if (printLeft) {
            System.out.println("商品剩余库存为：" + printLeft);
        }

        return totalCost;
    }

    // >> TODO 参数可以是任何类型，包括自定义类型，甚至是自己的类型都没问题
    public boolean totalValueBiggerThan(Merchandise merchandiseV2) {
        return count * purchasePrice > merchandiseV2.purchasePrice * merchandiseV2.count;
    }

    // >> TODO 参数可以是任何类型，包括自定义类型，甚至是自己的类型都没问题
    public boolean isTheBiggestTotalValueOne(LittleSuperMarket littleSuperMarket) {
        double totalValue = count * purchasePrice;
        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
            Merchandise m = littleSuperMarket.merchandises[i];
            double newTotalValue = m.count * m.purchasePrice;
            if (totalValue < newTotalValue) {
                // >> TODO 执行到return的时候，方法直接结束，不管是不是在循环中，是在第几层循环中。
                return false;
            }
        }
        return true;
    }

    // ---------------------------新增加的内容---------------------------

    public Merchandise gift;

    public double getSoldPrice() {
        return soldPrice;
    }

    public String getName() {
        return name;
    }

    public Merchandise getGiftAndHowCanOutsideChangeIt() {
        return gift;
    }


    public void willOutsideValueChangeIfParameterValueChangeHereRef(Merchandise m2) {
        m2 = gift;
    }

    public void willOutsideValueChangeIfParameterValueChangeHerePrime(int intVal) {
        intVal = 99999999;
    }

    public void changeToTheSameGift(Merchandise m2) {
        m2.gift = gift;
    }
}
