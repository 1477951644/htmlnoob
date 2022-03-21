package gra;

public class BMI {
    public static void main(String[] args) {
        double d = 1.65;
        int i = 59;
        double BMI;
        BMI = i/(d*d);
        System.out.println("你的身高是："+d);
        System.out.println("你的体重是："+i);
        System.out.println("你的BMI是:"+BMI);
        System.out.println("你的体重属于：");
        if (BMI < 18.5) {
            System.out.println("体重过重");
        }
        if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("正常范围");
        }
        if (BMI >= 24.9 && BMI < 29.9) {
            System.out.println("体重过重");
        }
        if (BMI>=29.9) {
            System.out.println("肥胖");
        }

    }
}
