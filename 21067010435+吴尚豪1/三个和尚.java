package gra;

import java.util.Scanner;

public class 三个和尚 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建对象 创建的对象为sc

        int man1 = sc.nextInt();
        System.out.println("第一个和尚的身高："+man1);
        int man2 = sc.nextInt();
        System.out.println("第二个和尚的身高："+man2);
        int man3 = sc.nextInt();
        System.out.println("第三个和尚的身高："+man3);

        int max1 = (man1>man2)?man1:man2;
        int max2 = (max1>man3)?max1:man3;

        System.out.println("max = "+max2);


    }
}
