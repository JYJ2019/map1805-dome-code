package com.it.code.demo02;

import java.util.Scanner;

/*
公司发年终奖，根据公司员工的职位不同，奖金数量也不一样，具体的规定如下：
	A 类：年终奖按 30% 提成；
	B 类：年终奖按 25% 提成：
	C 类：年终奖按 20% 提成；
	D 类：年终奖按 10% 提成；
	E 类：按5%提成。
	请您编写程序来实现公司年终奖发放的这一功能。
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入职位类别:");
        char charAt = sc.next().charAt(0);
        judge(charAt);
    }

    public static void judge(char charAt) {
        switch (charAt) {
            case 'A' :
                System.out.println("年终奖按 30% 提成");
                break;
            case 'B' :
                System.out.println("年终奖按 25% 提成");
                break;
            case 'C' :
                System.out.println("年终奖按 20% 提成");
                break;
            case 'D' :
                System.out.println("年终奖按 10% 提成");
                break;
            case 'E' :
                System.out.println("按5%提成");
                break;
            default:
                System.out.println("数据异常");
        }
    }
}
