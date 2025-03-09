package com.kiuchen.base.polymorphism.music;

// 重载也行得通，但是这样做会增加工程量而且不好维护
public class Music2 {
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed stringed = new Stringed();
        Brass brass = new Brass();
        tune(flute); // 非向上转型
        tune(stringed); // 非向上转型
        tune(brass); // 非向上转型
    }
}

class Stringed extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Stringed.play() " + n);
    }
}

class Brass extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Brass.play() " + n);
    }
}
