public class Vehicle {
    /**
     * Nadir Kutluozen - week 1 - lab
     * Parent class (blue print)!
     */
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    public Vehicle(int numberOfWheels, String color, float EngineSize, String fuelType){
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = EngineSize;
        this.fuelType = fuelType;

    }

    /***
     * Getter for numberOfWheels
     * @return numberOfWheels
     */
    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    /**
     * Sets the NumberOfWheels
     * @param numWheels number of wheels!
     */
    public void setNumberOfWheels(int numWheels){
        this.numberOfWheels = numWheels;
    }
    /***
     * Getter for color
     * @return color
     */
    public String getColor(){
        return color;
    }

    /**
     * Sets the color!
     * @param color -  color of the vehicle
     */
    public void setColor(String color){
        this.color = color;
    }


    /***
     * Getter for engineSize
     * @return engineSize
     */
    public float getEngineSize(){
        return engineSize;
    }

    /**
     * Sets the engine size
     * @param engineSize - engine size in float
     */
    public void setEngineSize(float engineSize){
        this.engineSize = engineSize;
    }

    /***
     * Getter for fuelType
     * @return fuelType
     */
    public String getFuelType(){
        return fuelType;
    }

    /**
     * Sets the fuel type
     * @param fuelType type of fuel!
     */
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    /***
     *
     * @return a string
     */
    @Override
    public String toString() {
        return "Number of Wheels: " + numberOfWheels + ", Color: " + color +
                ", Engine Size: " + engineSize + " liters, Fuel Type: " + fuelType;
    }
}
