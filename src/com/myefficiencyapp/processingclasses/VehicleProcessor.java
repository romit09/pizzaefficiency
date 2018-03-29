package src.com.myefficiencyapp.processingclasses;

public abstract class VehicleProcessor {

	public VehicleProcessor() {
		// TODO Auto-generated constructor stub
	}

	private void addVehicleData(String vehicle,String vehicleType,String numDeli,String tValue,String miles){
        if(vehicle.equals("car")){
            //CarProcessor car=new CarProcessor(vehicleType,numDeli,tValue,miles);
            //car.addDailyData();
        }
        else if(vehicle.equalsIgnoreCase("Moped")){
           // MopedProcessor moped=new MopedProcessor(numDeli,tValue,miles);
            //moped.addDailyData();
        }
        else if(vehicle.equals("bike")){
            BikeProcessor bike=new BikeProcessor(numDeli,tValue,miles);
            bike.addDailyData();
        }
        else{
            System.out.println("vehicle type not found");
        }
    }
    
    protected abstract void addDailyData();
}