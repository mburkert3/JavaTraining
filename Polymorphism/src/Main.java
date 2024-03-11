public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari",
                15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
