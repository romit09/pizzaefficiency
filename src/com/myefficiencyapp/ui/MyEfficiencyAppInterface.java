/**
 * 
 */
package src.com.myefficiencyapp.ui;


import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.*;

/**
 * @author Romit Nath
 *
 */
public class MyEfficiencyAppInterface {
	private HashMap<String,ArrayList<String>> vehicleMap;

    /**
     * 
     */
    public MyEfficiencyAppInterface() {
        // TODO Auto-generated constructor stub

        String option = JOptionPane.showInputDialog(null,"Please select the following options\n[1] Add Daily Data\n[2] Efficiency Report\n[3]Utility Menu\n[4]Exit",
                "MyEfficiency App", JOptionPane.PLAIN_MESSAGE);

        if(option.equals("1")){
            addDailyData();
        }
        else if(option.equals("2")) {
            efficiencyReport();
        }
    }

    private void efficiencyReport() {
        // TODO Auto-generated method stub

    }
    
    private void loadVehicleMap() {
		MyEfficiencyAppUtility utility=new MyEfficiencyAppUtility();
		vehicleMap = utility.getVehicleList();
		
	}

    private void addDailyData() {
        // TODO Auto-generated method stub
        Object[] vehicleType = {"Bike","Moped","Car"};
        Object[] vehicleTaxBand = {"Tax Band 1","Tax Band 2","Tax Band 3","Tax Band 4","Tax Band 5"};
        
        List<String> bikeId = vehicleMap.get("Bike");
        List<String> mopedId = vehicleMap.get("Moped");
        List<String> carId = vehicleMap.get("Car");
        
        String taxBand = null;

        //JFrame frame = null;
        JPanel labels = new JPanel(new GridLayout(4,4));
        JTextField deliveries = new JTextField("");
        JTextField tValue = new JTextField("");
        JTextField tMiles = new JTextField("");

        String vType = (String)JOptionPane.showInputDialog(null,"Select Vehicle Type","Add Daily Option",JOptionPane.PLAIN_MESSAGE,null, vehicleType,"Bike");
        if ((vType != null) && (vType.length() > 0)) {
            if(vType.equals("Bike")) {
            	String id = (String)JOptionPane.showInputDialog(bikeId, vehicleMap);
            	labels.add(new JLabel("\nNumber of Deliveries"));
                labels.add(deliveries);
                labels.add(new JLabel("\nTotal Order Value"));
                labels.add(tValue);
                labels.add(new JLabel("\nMiles Covered"));
                labels.add(tMiles);
                JOptionPane.showConfirmDialog(null,labels,"Add Details",JOptionPane.PLAIN_MESSAGE);
            }
            else if(vType.equals("Moped")) {
            	
            	String id = (String)JOptionPane.showInputDialog(mopedId, vehicleMap);
                labels.add(new JLabel("\nNumber of Deliveries"));
                labels.add(deliveries);
                labels.add(new JLabel("\nTotal Order Value"));
                labels.add(tValue);
                labels.add(new JLabel("\nMiles Covered"));
                labels.add(tMiles);
                JOptionPane.showConfirmDialog(null,labels,"Add Details",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                taxBand = (String)JOptionPane.showInputDialog(null,"Select Tax Band","Tax Band Options",JOptionPane.PLAIN_MESSAGE,null, vehicleTaxBand,"Tax Band 1");
                if ((taxBand != null) && (vType.length() > 0)) 
                {
                	String id = (String)JOptionPane.showInputDialog(carId, vehicleMap);
                    labels.add(new JLabel("\nNumber of Deliveries"));
                    labels.add(deliveries);
                    labels.add(new JLabel("\nTotal Order Value"));
                    labels.add(tValue);
                    labels.add(new JLabel("\nMiles Covered"));
                    labels.add(tMiles);
                    JOptionPane.showConfirmDialog(null,labels,"Add Details",JOptionPane.PLAIN_MESSAGE);
                }
            }
        }

        //MyEfficiencyAppController mc = new MyEfficiencyAppController();
        //mc.addVehicleData(vType,taxBand,"123",deliveries.getText(),tValue.getText(),tMiles.getText());
        return;
    }
}

