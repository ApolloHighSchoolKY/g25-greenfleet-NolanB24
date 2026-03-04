import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) 
    {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
        
        // TODO: Add a standard Vehicle and an ElectricCar
        Vehicle ford =  new Vehicle("Ford 1967");
        ElectricCar tesla = new ElectricCar("tesla");
        inventory.add(ford);
        inventory.add(tesla);
            // TODO: Loop through inventory. 
            // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
        for(Vehicle v: inventory)
        {
            if(v instanceof ElectricCar )
                if(ElectricCar.getCharge <= 50.0)
                    System.out.println("Your electric vehicle needs charing.");
                System.out.println("The electric vehicle is charged.");
            ford.drive(70);
            tesla.drive(70);
            System.out.println(ford);
            System.out.println(tesla);
            System.out.println("--- End of Day Report ---");
            
        }

    }
}
