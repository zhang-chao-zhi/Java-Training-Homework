package com;

import com.supermarket.SuperMarket;
import com.supermarket.Merchandise;

public class RunSuperMarket {
    public static void main(String[] args) {
        // 创建一个小超市类
        SuperMarket littleSuperMarket = new SuperMarket(
                "有家小超市", "浦东新区世纪大道666号",
                100, 200, 200);

        System.out.println("VIP的折上折折扣最终为：" + Merchandise.getDiscountOnDiscount(littleSuperMarket));

    }
}
