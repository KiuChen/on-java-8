package com.kiuchen.base.polymorphism.music;

class Instrument {
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
}

public class Wind extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }
}