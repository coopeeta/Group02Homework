package com.syntax.group2.OOPs;
/*
  Create a Class Car that would have the following fields: 
  carPrice, color, and method calculateSalePrice() 
  which should be returning a price of the car.
  
  Create 2 sub classes: Sedan and Truck. 
  The Truck  class has field as weight and has its own
  implementation of calculateSalePrice() method in
  which returned price calculated as following:
  if weight>2000 then returned price car should include
  10% discount, otherwise 20% discount.
  
  The Sedan class has field as length and also does it
  its own implementation of calculateSalePrice(): 
  if length of sedan is >20 feet then returned car price
  should include 5% discount, otherwise 10% discount
 */
public class OOPsTask3 {
    public static void main(String[] args) {

        Car[] car = {new Truck(50000, 2500, "white"), new Sedan(35000, 22, "black")};
        for (Car c : car) {
            System.out.println(c.calculateSalePrice());
        }
    }
}

abstract class Car {
    double carPrice;
    String carColor;

    abstract double calculateSalePrice();

    public Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }
}

class Sedan extends Car {
    double length;

    public Sedan(double carPrice, double length, String carColor) {
        super(carPrice, carColor);
        this.length = length;
    }

    double calculateSalePrice() {
        if (length > 20) {
            return carPrice = carPrice - (carPrice * 0.05);
        } else {
            return carPrice = carPrice - (carPrice * 0.10);
        }
    }
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, double weight, String carColor) {
        super(carPrice, carColor);
        this.weight = weight;
    }

    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice = carPrice - (carPrice * 0.10);
        } else {
            return carPrice = carPrice - (carPrice * 0.20);
        }
    }
}