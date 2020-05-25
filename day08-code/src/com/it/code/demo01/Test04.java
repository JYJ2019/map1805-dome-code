package com.it.code.demo01;

//姓名:金宇佳
//学校:长工职地图1805班
//考试码:xXxxX

import java.util.Arrays;
import java.util.Scanner;

/*
4.	循环输入有5个元素的整型数组，
并用冒泡排序对数组从大到小排序。（30分）
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入一个整数");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
