/**
 * 
 */
package src.com.myefficiencyapp.pojo;

/**
 * @author Ritudhwaj
 *
 */
public class CarsPOJO extends VehicleBasePOJO {
	private final String serviceAndMaintenanceCost = "2250";
	private String cartype;
	private double fuelCostPerMile;
	private double roadTaxPerAnnum;

	/**
	 * 
	 */
	public CarsPOJO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cartype
	 */
	public String getCartype() {
		return cartype;
	}

	/**
	 * @param cartype
	 *            the cartype to set
	 */
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	/**
	 * @return the fuelCost
	 */
	public double getFuelCostPerMile() {
		return fuelCostPerMile;
	}

	/**
	 * @param fuelCost
	 *            the fuelCost to set
	 */
	public void setFuelCostPerMile(double fuelCostPerMile) {
		this.fuelCostPerMile = fuelCostPerMile;
	}

	/**
	 * @return the roadTax
	 */
	public double getRoadTaxPerAnnum() {
		return roadTaxPerAnnum;
	}

	/**
	 * @param roadTax
	 *            the roadTax to set
	 */
	public void setRoadTaxPerAnnum(double roadTaxPerAnnum) {
		this.roadTaxPerAnnum = roadTaxPerAnnum;
	}

	/**
	 * @return the serviceAndMaintenanceCost
	 */
	public String getServiceAndMaintenanceCost() {
		return serviceAndMaintenanceCost;
	}

}
