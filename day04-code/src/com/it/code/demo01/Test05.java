package com.it.code.demo01;

import java.util.Scanner;

/*
某市出租车3KM的起步价和计费分别为：
夏利3元，3km以外，2.1元/km;
富康4元， 3km以外，2.4元/km；
桑塔纳5元，3km以外，2.7元/km。
请输入乘车车型及千米数，
输出应付车费。
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入车型: 1.夏利 2.富康 3.桑塔纳");
        int name = sc.nextInt();
        System.out.println("请输入搭乘千米数:");
        double km = sc.nextDouble();
        judge(name, km);
    }

    public static void judge(int name, double km) {
        double money = 0.0;
        final int a = 3;
        if (km > 0 && km <= 3) {
            switch (name) {
                //夏利3元
                case 1:
                    money = 3;
                    break;
                //富康4元
                case 2:
                    money = 4;
                    break;
                //桑塔纳5元
                case 3:
                    money = 5;
                    break;
                default:
                    System.out.println("车型数据非法!");
            }
        } else if (km > 3) {
            switch (name) {
                //夏利3元,3km以外，2.1元/km;
                case 1:
                    money = 3 + (km - a) * 2.1;
                    break;
                //富康4元,3km以外，2.4元/km；
                case 2:
                    money = 4 + (km - a) * 2.4;
                    break;
                //桑塔纳5元，3km以外，2.7元/km。
                case 3:
                    money = 5 + (km - a) * 2.7;
                    break;
                default:
                    System.out.println("车型数据非法!");
            }
        } else {
            System.out.println("千米数,数据非法!");
        }
        if (money != 0.0) {
            System.out.println("车费为:" + money);
        }
    }
}
