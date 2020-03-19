package com.examples.ex14_CompositionDemo;

interface Car{
    public void start();
}

class CommonCar implements Car{
    public void start(){
        System.out.println("starting...");
    }
}

class DivingPlugIn{
    public void dive(){
        System.out.println("diving...");
    }
}

class FlyingPlugIn{
    public void fly(){
        System.out.println("flying...");
    }
}

class SuperCar implements Car{
    private CommonCar car = new CommonCar();
    private DivingPlugIn divingPlugIn = new DivingPlugIn();
    private FlyingPlugIn flyingPlugIn = new FlyingPlugIn();

    @Override
    public void start() {
        car.start();
    }

    public void fly(){
        flyingPlugIn.fly();
    }

    public void dive(){
        divingPlugIn.dive();
    }
}

class Driver{
    String name;

    public Driver(){
        name="";
    }
    public Driver(String name){
        this.name = name;
    }

    public void testCar(Car car){

        if(car instanceof CommonCar){
            System.out.println(name + " test CommonCar...");
            car.start();
        }
        else if(car instanceof SuperCar){
            System.out.println(name + " test SuperCar...");
            SuperCar superCar = (SuperCar)car;
            superCar.start();
            superCar.fly();
            superCar.dive();
        }
    }
}

public class ex14_CompositionDemo1 {

    public static void main(String[] args) {
        Driver driver = new Driver("Amy");
        SuperCar superCar = new SuperCar();
        Car basicCar = new CommonCar();

        driver.testCar(basicCar);
        driver.testCar(superCar);

    }

}
