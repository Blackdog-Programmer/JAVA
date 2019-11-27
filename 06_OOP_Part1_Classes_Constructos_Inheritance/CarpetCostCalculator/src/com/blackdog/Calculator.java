package com.blackdog;

public class Calculator {
    private Carpet carpet;
    private Floor floor;

    public Calculator(Floor newFloor, Carpet newCarpet) {
        this.floor = newFloor;
        this.carpet = newCarpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
