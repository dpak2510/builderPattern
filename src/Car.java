class Engine{
    private double horsePower;
    public Engine( double horsePower ){
        this.horsePower = horsePower;
    }

    @Override
    public String toString(){
        return "[Engine with horsePower: " + horsePower + "]";
    }
}


public class Car{
    private Engine engine; // Required
    private String modelNo; // Required
    private String name; // Optional
    private int price; // Optional
    private double maxSpeed; // Optional
    
    private Car(BuilderCar bc){
        engine = bc.engine;
        modelNo = bc.modelNo;
        name = bc.name;
        price = bc.price;
        maxSpeed = bc.maxSpeed;
    }

    @Override
    public String toString(){
        return "Car: " + modelNo + "\nName: " + name + "\nPrice: " + price + "\nMax Speed: " + maxSpeed 
            + "\nEngine: " + engine;
    }

    public static class BuilderCar{
        private Engine engine;
        private String modelNo;
        private String name;
        private int price = -1;
        private double maxSpeed = -1;
        
        public BuilderCar( String modelNo, Engine engine ){ // Required fields are set here.
            this.modelNo = modelNo;
            this.engine = engine;
        }

        public BuilderCar setName(String name)
        {
            this.name = name;
            return this;
        }
        public BuilderCar setPrice(int price)
        {
            this.price = price;
            return this;
        }
        public BuilderCar setMaxSpeed(double maxSpeed)
        {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }

    }
}