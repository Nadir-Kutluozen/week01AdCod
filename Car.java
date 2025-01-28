public class Car extends Vehicle{
    /**
     * Nadir Kutluozen - week 1 - lab
     * This class extends to Vehicle to
     * use its parent features
     */
    private String brand;

    /**
     * Initialize the variables associated with the Object!
     * @param numberOfWheels
     * @param color
     * @param engineSize
     * @param fuelType
     * @param brand
     */
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand){
        super(numberOfWheels, color, engineSize, fuelType);;
        this.brand = brand;
    }

    /**
     * Just prints Honk honk!
     */
    public void honk(){
        System.out.println("Honk, honk!");
    }

    /**
     * Gets the toString from parent and add brand
     * to the String!
     */
    public void displayInfo(){
        System.out.println("Brand: " + brand + "\n" + this.toString());
    }
}
