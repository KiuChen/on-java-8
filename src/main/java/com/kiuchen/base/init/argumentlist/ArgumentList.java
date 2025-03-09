package com.kiuchen.base.init.argumentlist;

public class ArgumentList {
    public static void main(String[] args) {

    }
}

// 支持主动装箱机制
class  AutoboxingVarargs {
    public static void f(Integer... args) {
        for (Integer i : args) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(new Integer(1), new Integer(2));
        f(4,5,6,7,8);
    }
}

// 重载也是支持的，但是这会出现新问题
class OverloadingVarargs {
    static void f(Character... args) {
        System.out.print("first");
        for (Character c : args) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.print("second");
        for (Integer i : args) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void f(Long... args) {
        System.out.print("third");
    }

    public static void main(String[] args) {
        f('a','b','c');
        f(1);
        f(2,1);
        f(0);
        f(0L);
        // f(); 这句无法编译通过，因为编译器不知道该调用哪一个了
    }
}

class OverloadingVarargs2 {
    static void f(float f,Character... args) {
        System.out.println("first");
    }

/*
    static void f(Character... args) {
        System.out.print("second");
    }
*/

    static void f(char c,Character... args) {
        System.out.print("second");
    }

    public static void main(String[] args) {
        // 下边两句也会有一样的问题，编译器会找不到调用哪个方法，因为他们都可以有两个参数
        // 可以给其中一个方法加上非可变列表参数就好了
        f(1,'a');
        f('a','b');
        // f(); 这句无法编译通过，因为编译器不知道该调用哪一个了
    }
}