package com.it.code.demo02;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("语文");
        double i = sc.nextDouble();
        System.out.println("数学");
        double i2 = sc.nextDouble();
        System.out.println("英语");
        double i3 = sc.nextDouble();

        print((int) i, (int) i2, (int) i3);
        int sum = (int) sum(i, i2, i3);
        System.out.println("总分" + sum);
        double score = score(sum);
        System.out.println("平均分:" + score);
    }

    public static void print(int i, int i2, int i3) {
        System.out.println("语文\t数学\t英语");
        System.out.println(i + "\t\t" + i2 + "\t\t" + i3);
    }

    public static double sum(double i, double i2, double i3) {
        return i + i2 + i3;
    }

    public static double score(int sum) {
        double d = sum / 3.0;
        d = (double) Math.round(d * 10) / 10;
        return d;
    }

}
