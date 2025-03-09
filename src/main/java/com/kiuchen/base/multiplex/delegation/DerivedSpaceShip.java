package com.kiuchen.base.multiplex.delegation;
// 使用继承构造太空船
public class DerivedSpaceShip extends SpaceShipControls {
    private String name;

    public DerivedSpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        DerivedSpaceShip protector = new DerivedSpaceShip("NSEA Protector");
        protector.forward(100);
        System.out.println(protector);
    }
}
