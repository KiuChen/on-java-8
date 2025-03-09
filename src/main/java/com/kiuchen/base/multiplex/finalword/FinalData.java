package com.kiuchen.base.multiplex.finalword;

import java.util.Random;

public class FinalData {
    private final int value = 1;
    private static final int VALUE_2 = 2;
    public static final int VALUE_3 = 3;
    // final 字段，必须在定义或者构造器中初始化
    private final int heihei;
    // 可以通过方法初始化值，会多次变化
    private final int i4 = f();
    // 只在初始化获取一次值，不会变
    static final int INT_5 = f();

    public static int f() {
        return new Random(22).nextInt();
    }

    public FinalData(int heihei) {
        this.heihei = heihei;
    }

    void f(final int i1) {
        // 不可修改
//        i1++;
    }
    // 能读取，不能修改
    int g(final int g){
        System.out.println(g);
        System.out.println(g+1);
        return g+1;
    }

    public static void main(String[] args) {
        FinalData data = new FinalData(21);
        // 会报错
//        data.value++;
        data.g(11);
    }


}
