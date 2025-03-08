package com.kiuchen.base.aboutstatic;

public class ExplicitStatic {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
//    static Cup cup1 = new Cup(1);
//    static Cup cup2 = new Cup(2);
}



class Cup{
    Cup(int marker){
        System.out.println("Cup("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    // 显式的静态初始化
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}