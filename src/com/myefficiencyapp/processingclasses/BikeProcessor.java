/**
 * 
 */
package src.com.myefficiencyapp.processingclasses;

import com.myefficiencyapp.pojo.BikePOJO;

/**
 * @author Ritudhwaj
 *
 */
public class BikeProcessor extends VehicleProcessor {
	BikePOJO bike;

    /**
     * 
     */
    public BikeProcessor(String numDeli, String tValue, String miles) {
        bike=new BikePOJO();
        bike.setTotalDeliveries(numDeli);
        bike.setTotalCostOfDeliveries(tValue);
        bike.setTotalMilesCovered(miles);
    }
    
    @Override
    protected void addDailyData() {
        // TODO Auto-generated method stub
        
    }

}