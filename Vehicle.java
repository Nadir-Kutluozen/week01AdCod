public class Vehicle {
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

    /***
     * Getter for color
     * @return color
     */
    public String getColor(){
        return color;
    }

    /***
     * Getter for engineSize
     * @return engineSize
     */
    public float getEngineSize(){
        return engineSize;
    }

    /***
     * Getter for fuelType
     * @return fuelType
     */
    public String getFuelType(){
        return fuelType;
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
