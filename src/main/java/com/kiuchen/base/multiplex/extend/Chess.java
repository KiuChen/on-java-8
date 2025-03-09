package com.kiuchen.base.multiplex.extend;

/**
 * 带参数的构造器，必须使用 super(x) 调用基类
 */
class Game{
    Game(int i){
        System.out.println(" Game Constructor ");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println(" BoardGame Constructor ");
    }
}

class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println(" Chess Constructor ");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}