import java.util.logging.Level;

import javax.swing.tree.VariableHeightLayoutCache;

public class ElectricCar extends Vehicle {
    private double batteryPercent;

    public ElectricCar(String model) {
        // TODO: Use super() to set the model
        super(model);
        // TODO: Set batteryPercent to 100.0
        batteryPercent = 0.0;
    }

    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     * 
     */
    @Override
    public void drive(int distance)
    {
        // TODO: Call super.drive()
        //The engine is running
        if(getEngineStatus() == true)
        {
            if(batterPercent -= (distance/5.0) >= 0)
            {
                batteryPercent -= (distance/5.0);
            }
            else
                batteryPercent -= (distance/5.0);
             
        }

    }
    public void batteryLevel() {
        batteryPercent = 100.0;
    }
    public double getbatteryLevel(){
        return batteryPercent;
    }    
}
