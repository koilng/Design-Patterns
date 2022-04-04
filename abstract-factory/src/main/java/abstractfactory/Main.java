package src.main.java.abstractfactory;

import src.main.java.abstractfactory.Car.FactoryMaker.CarType;

public class Main {

  private static final Car car = new Car();

  public static void main(String[] args) {
    createCar(CarType.UNIVERSAL);
    System.out.println(car.getBody().getDescription());
    System.out.println(car.getEngine().getDescription());
    System.out.println(car.getTyres().getDescription());
  }

  public static void createCar(final Car.FactoryMaker.CarType carType) {
    final CarFactory carFactory = Car.FactoryMaker.makeFactory(carType);
    car.setBody(carFactory.createBody());
    car.setEngine(carFactory.createEngine());
    car.setTyres(carFactory.createTyres());
  }
}
