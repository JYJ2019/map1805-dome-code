package com.it.code.demo01;

import java.util.Arrays;
import java.util.Scanner;

/*
3.	循环输入有5个元素的整型数组，
求出数组中的最大值和最小值。（20分）
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            array[i]  = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println("最小值:" + array[0]);
        System.out.println("最大值:" + array[array.length - 1]);
    }
}
