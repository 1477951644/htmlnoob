package gra;

public class 位移运算符 {
    public static void main(String[] args) {
        int password = 751248;
        int key = 7;
        System.out.println("原密码:"+password);
        password = password << key;
        System.out.println("经过左移运算加密后的结果："+password);
        password = password >> key;
        System.out.println("经过右移运算加密后的结果："+password);
    }
}
