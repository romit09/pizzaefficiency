package src.com.myefficiencyapp.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyEfficiencyAppUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public HashMap<String,ArrayList<String>> getVehicleList(){
		ArrayList<String> bike=new ArrayList<>();
		ArrayList<String> moped=new ArrayList<>();
		ArrayList<String> car=new ArrayList<>();
		HashMap<String,ArrayList<String>> vehicleUidMap=new HashMap<>();
		File file=new File("VehicleInventory.txt");
		Scanner sc = null;
		try {
			sc=new Scanner(file);
			while(sc.hasNext()){
				String[] vehicleDetails=sc.next().split(",");
				if(vehicleDetails[0].equalsIgnoreCase("bike")){
					bike.add(vehicleDetails[1]);
				}
				else if(vehicleDetails[0].equalsIgnoreCase("moped")){
					moped.add(vehicleDetails[1]);
				}
				else{
					car.add(vehicleDetails[2]);
				}
			}
			vehicleUidMap.put("bike", bike);
			vehicleUidMap.put("moped", moped);
			vehicleUidMap.put("car", car);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
		return vehicleUidMap;
		
	}

}
