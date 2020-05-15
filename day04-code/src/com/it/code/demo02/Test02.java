package com.it.code.demo02;

import java.util.Scanner;

/*
编写程序，输入学生结业的笔试成绩、机试成绩，
如果笔试成绩和机试成绩都达到60分，
则通过结业考试；
否则没有通过，需要补考。

 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入笔试成绩:");
        int written = sc.nextInt();
        System.out.println("请输入机试成绩:");
        int machine = sc.nextInt();
        judge(written, machine);

    }

    public static void judge(int written, int machine) {
        if (written < 0 || written > 120 || machine < 0 || machine > 120) {
            System.out.println("成绩数据异常!");
        } else if (written >= 60 && machine >= 60) {
            System.out.println("成绩合格!通过结业考试!");
        } else {
            System.out.println("成绩不合格!没有通过,需要补考.");
        }

    }
}
