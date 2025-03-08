package com.kiuchen.base.aboutstatic;

/**
 * 对象创建过程：
 * 1.构造器实际也是静态方法，第一次创建对象或访问类中静态方法和变量的时候，java解释器定位类文件 Bowl.class
 * 2.当 Bowl.class 加载后， 所有静态初始化工作开始，且只进行这一次
 * 3.使用 new Bowl() 创建对象，会在堆上为 Bowl 对象分配足够存储空间
 * 4.存储空间清空，将 Bowl 对象中全部基础类型赋默认值，引用类型为null
 * 5.执行出现在字段定义处的初始化操作
 * 6.执行构造器
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("main creating new Cupboard()");
        new Cupboard();
        System.out.println("main creating new Cupboard()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}


class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}
