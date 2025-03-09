package com.kiuchen.base.polymorphism.shape;

import java.util.Random;

public class RandomShapes {
    private Random random = new Random(47);
    public Shape get(){
        switch(random.nextInt(3)){
            default :
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();

        }
    }

    public Shape[] array(int sz){
        Shape[] shapes = new   Shape[sz];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = get();
        }

        return shapes;
    }

    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        for (Shape shape : gen.array(9)) {
            shape.draw();
        }
    }
}
