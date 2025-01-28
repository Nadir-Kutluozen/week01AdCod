public class Main {
    /***
     * Nadir Kutluozen - week01 "Create a Vehicle Class and a Child Class called Car in Java"
     */
    public static void main(String[] args){
        // testing the Vehicle class here!
        Vehicle anyVehicle = new Vehicle(4,"red",2f,"Gasoline");
        System.out.println(anyVehicle);
        System.out.println("anyVehicle object before setting engine size^");

        anyVehicle.setEngineSize(3f);//Setting the engine size of the vehicle obj!

        System.out.println(anyVehicle);
        System.out.println("anyVehicle object after setting engine size^");

        // The car class that was inherited aspects from Vehicle class.
        Car myAudi = new Car(4,"red",3.0f,"Gasoline","Audi");
        Car myToyota = new Car(4, "Blue", 1.8f, "Hybrid", "Toyota");
        Car myTesla = new Car(4, "White", 0.0f, "Electric", "Tesla");
        Car myFord = new Car(4, "Black", 5.0f, "Diesel", "Ford");

        myAudi.honk();//method to print honk honk!


        myAudi.displayInfo();
        myToyota.displayInfo();
        myTesla.displayInfo();
        myFord.displayInfo();
    }
}
