package lesson13 ;

// interface 1
interface Car {
    // empty interface
}


// interface 2 extending interface 1
interface EvCar extends Car{
    // constants
    String modelType = "ev" ;

    // abstract methods
    void autopark();
    void autopilot();
}

// interface 3 extending interface 2
interface SportsCar extends Car{

    // constants
    String modelType = "Sports" ;

    // abstract mehtod
    void sports() ;
}

class BMWiX1 implements EvCar , SportsCar{

    // declaration of abstract methods
    @Override
    public void autopark() {
        System.out.println("car in auto park mode !!");
    }

    @Override
    public void autopilot() {
        System.out.println("car in autopilot mode !!");
    }

    @Override
    public void sports() {
        System.out.println("car in offroad mode !!");
    }
}





public class Interface {
    public static void main(String[] args) {

        // object creation
        BMWiX1 mycar1 = new BMWiX1() ;

        // anonymous inner class object creation through interface
        EvCar myCar2 = new EvCar() {
            @Override
            public void autopark() {
                System.out.println("car in auto park mode !!");
            }

            @Override
            public void autopilot() {
                System.out.println("car in autopilot mode !!");
            }
        };

        // output
        Car[] parkingArea = new Car[2] ;
        parkingArea[0] = mycar1 ;
        parkingArea[1] = myCar2 ;


        mycar1.autopark();
        myCar2.autopark();

    }


}