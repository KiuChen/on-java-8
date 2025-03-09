package com.kiuchen.base.init.aboutstatic;

/**
 * 非静态实例初始化
 */
public class Mugs {
    Mug mug1;
    Mug mug2;
    // 每次生成对象这部分都会执行ßß
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int:"+ i +")");

    }


    public static void main(String[] args) {

        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}


class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}



