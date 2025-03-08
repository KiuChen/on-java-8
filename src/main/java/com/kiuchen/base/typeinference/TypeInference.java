package com.kiuchen.base.typeinference;

// 类型推断
public class TypeInference {
    void method(){
        // 显式
        String hello1 = "hello";
        // 基础类型推断
        var hello = "Hello";
        // 自定义类型推断
        Plumbus b1 = new Plumbus();
        var b2 = new Plumbus();

    }
    static void staticMethod(){
        var hello = "Hello";
        var plum = new Plumbus();
    }
}

class Plumbus{

}

class NoInference{
    String field = "Field initialization";
    // var field2 = "Can't do this";
//    void method(){
//        var noInitializer;
//        var aNull = null;
//    }

//    var inferReturnType(){
//        return "Can;t infer return type";
//    }
}




