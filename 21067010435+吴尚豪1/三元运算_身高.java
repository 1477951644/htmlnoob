package gra;

public class 三元运算_身高 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;
        int max1 = (a>b)?a:b;
        int max2 = (max1>c)?max1:c;
        System.out.println("max = "+max2);
    }
}
