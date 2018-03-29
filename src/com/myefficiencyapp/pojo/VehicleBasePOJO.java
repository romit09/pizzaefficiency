/**
 * 
 */
package src.com.myefficiencyapp.pojo;

/**
 * @author Ritudhwaj
 *
 */
public abstract class VehicleBasePOJO {
	private String totalBikes;
	private String totalMopeds;
	private String totalCars;
	private String UniqueID;
	private String daysInService;
	private String totalMilesCovered;
	private String totalDeliveries;
	private String totalCostOfDeliveries;

	/**
	 * 
	 */
	public VehicleBasePOJO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the totalBikes
	 */
	public String getTotalBikes() {
		return totalBikes;
	}

	/**
	 * @param totalBikes
	 *            the totalBikes to set
	 */
	public void setTotalBikes(String totalBikes) {
		this.totalBikes = totalBikes;
	}

	/**
	 * @return the totalMopeds
	 */
	public String getTotalMopeds() {
		return totalMopeds;
	}

	/**
	 * @param totalMopeds
	 *            the totalMopeds to set
	 */
	public void setTotalMopeds(String totalMopeds) {
		this.totalMopeds = totalMopeds;
	}

	/**
	 * @return the totalCars
	 */
	public String getTotalCars() {
		return totalCars;
	}

	/**
	 * @param totalCars
	 *            the totalCars to set
	 */
	public void setTotalCars(String totalCars) {
		this.totalCars = totalCars;
	}

	/**
	 * @return the uniqueID
	 */
	public String getUniqueID() {
		return UniqueID;
	}

	/**
	 * @param uniqueID
	 *            the uniqueID to set
	 */
	public void setUniqueID(String uniqueID) {
		UniqueID = uniqueID;
	}

	/**
	 * @return the daysInService
	 */
	public String getDaysInService() {
		return daysInService;
	}

	/**
	 * @param daysInService
	 *            the daysInService to set
	 */
	public void setDaysInService(String daysInService) {
		this.daysInService = daysInService;
	}

	/**
	 * @return the totalMilesCovered
	 */
	public String getTotalMilesCovered() {
		return totalMilesCovered;
	}

	/**
	 * @param totalMilesCovered
	 *            the totalMilesCovered to set
	 */
	public void setTotalMilesCovered(String totalMilesCovered) {
		this.totalMilesCovered = totalMilesCovered;
	}

	/**
	 * @return the totalDeliveries
	 */
	public String getTotalDeliveries() {
		return totalDeliveries;
	}

	/**
	 * @param totalDeliveries
	 *            the totalDeliveries to set
	 */
	public void setTotalDeliveries(String totalDeliveries) {
		this.totalDeliveries = totalDeliveries;
	}

	/**
	 * @return the totalCostOfDeliveries
	 */
	public String getTotalCostOfDeliveries() {
		return totalCostOfDeliveries;
	}

	/**
	 * @param totalCostOfDeliveries
	 *            the totalCostOfDeliveries to set
	 */
	public void setTotalCostOfDeliveries(String totalCostOfDeliveries) {
		this.totalCostOfDeliveries = totalCostOfDeliveries;
	}

}
