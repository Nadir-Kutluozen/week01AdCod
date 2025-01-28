public class Main {
    /***
     * Nadir Kutluozen - week01 "Create a Vehicle Class and a Child Class called Car in Java"
     * @param args
     */
    public static void main(String[] args){

        // The car class that was inherited everything from Vehicle class.
        Car myAudi = new Car(4,"red",3.0f,"Gasoline","Audi");
        Car myToyota = new Car(4, "Blue", 1.8f, "Hybrid", "Toyota");
        Car myTesla = new Car(4, "White", 0.0f, "Electric", "Tesla");
        Car myFord = new Car(4, "Black", 5.0f, "Diesel", "Ford");



        myAudi.honk();
        myAudi.displayInfo();

        myToyota.displayInfo();
        myTesla.displayInfo();
        myFord.displayInfo();
    }
}
