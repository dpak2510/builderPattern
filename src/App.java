public class App {
    public static void main(String[] args) throws Exception {
        Engine eng = new Engine(400);
        Car car = new Car.BuilderCar("BMW", eng).setName("ABCD").build();
        System.out.println(car);
    }
}
