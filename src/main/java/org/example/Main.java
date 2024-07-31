package org.example;

import org.example.company.Car;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,"R3");
        System.out.println(car.toString());
        Car mitsubishi = new Mitsubishi(2,"M6");
        System.out.println(mitsubishi.toString());
        System.out.println(mitsubishi.getName());
        System.out.println(mitsubishi.startEngine());
    }
}