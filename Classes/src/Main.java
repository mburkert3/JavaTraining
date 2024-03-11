public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Camaro");
        car.setModel("Carrerea");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Blue");

        Car targa = new Car();
        targa.setMake("Challenger");
        targa.setModel("Ruby");
        targa.setDoors(4);
        targa.setConvertible(false);
        targa.setColor("Black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();
        targa.describeCar();






    }
}