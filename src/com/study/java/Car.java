package com.study.java;
public class Car {
    String color;
    int speed;

    public Car() {
    }

    public void speedUp() {
        speed = speed + 5;
    }

    public void speedDown() {
        speed = speed - 5;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String args[]) {
        Car blueCar = new Car();
        blueCar.setColor("blue");
        blueCar.speedUp();
        blueCar.speedDown();

        Car redCar = new Car();
        redCar.setColor("red");
        redCar.speedUp();

        System.out.println("Blue Car - " + blueCar.color + " / speed - " + blueCar.speed + " 주소 : " + blueCar);
        System.out.println("Red Car - " + redCar.color + " / speed - " + redCar.speed + " 주소 : " + redCar);
    }
}
