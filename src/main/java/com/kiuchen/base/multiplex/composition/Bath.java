package com.kiuchen.base.multiplex.composition;

/**
 * 引用类型的四种初始化方式
 */
public class Bath {
    // 1.定义初始化
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath(){
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        // 2.构造器初始化
        castille = new Soap();
    }
    // 3.实例初始化
    {i = 47;}
    public String toString(){
        // 延迟初始化
        if(s4 == null){
            s4 = "Joy";
        }
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }
    public static void main(String[] args){
        Bath b = new Bath();
        System.out.println(b);
    }
}

class Soap{
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
