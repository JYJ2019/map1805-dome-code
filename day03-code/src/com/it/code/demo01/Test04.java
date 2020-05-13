package com.it.code.demo01;

import java.util.ArrayList;
import java.util.Scanner;

//0开头有bug
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的卡号:");
        int num = scanner.nextInt();
        ArrayList<Integer> print = print(num);
        num(print);
    }


    public static ArrayList<Integer> print(int num) {
        int mask = 1;
        int t = num;
        ArrayList<Integer> intsList = new ArrayList<>();
        while (t > 9) {
            t /= 10;
            mask *= 10;
//            System.out.print(t+ "\t");
        }
//        System.out.println(num+"\t" + mask);
        do {
            int d = num / mask;
//            System.out.print(d);
            if (mask > 9) {
//                System.out.print(" ");
            }
            num %= mask;
            mask /= 10;
            intsList.add(d);
        } while (mask > 0);
//        System.out.println();
        return intsList;
    }

    public static void num(ArrayList<Integer> intsList) {
        int sum = 0;
        boolean temp = true;
        if (intsList.size() >= 4) {
            for (int i = 0; i < intsList.size(); i++) {
                int a = intsList.get(i);
                sum += a;
                if (a == 8) {
                    temp = false;
                }
            }
            System.out.println("数字之和:" + sum);
            if (sum % 8 == 0 && temp) {
                System.out.println("是否中奖 true");
            } else {
                System.out.println("是否中奖 false");
            }
        }
        else {
            System.out.println("请输入长度大于4位的卡号,0不能开头");
        }

    }


}
