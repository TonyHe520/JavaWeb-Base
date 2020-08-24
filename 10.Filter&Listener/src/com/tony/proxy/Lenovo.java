package com.tony.proxy;

/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/24 11:24
 */

/**
 * 真实类
 */
public class Lenovo implements SaleComputer {
    @Override
    public String sale(double money) {

        System.out.println("花了"+money+"元买了一台联想电脑...");
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.println("展示电脑....");
    }
}
