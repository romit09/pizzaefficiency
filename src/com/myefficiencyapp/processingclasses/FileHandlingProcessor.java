/**
 * 
 */
package src.com.myefficiencyapp.processingclasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.myefficiencyapp.pojo.CarsPOJO;

/**
 * @author Ritudhwaj
 *
 */
public class FileHandlingProcessor {
	// private final String CarTypeDetails = "CarTypeDetails";

	/**
	 * 
	 */
	public FileHandlingProcessor() {
		// TODO Auto-generated constructor stub
	}

	private CarsPOJO readCarDetails(String carType) throws IOException {
		Properties prop = new Properties();
		InputStream input = new FileInputStream("CarDetails.properties");
		prop.load(input);

		String[] details = prop.getProperty(carType).split(",");
		CarsPOJO cp = new CarsPOJO();
		cp.setCartype(carType);
		cp.setFuelCostPerMile(Double.parseDouble(details[1]));
		cp.setRoadTaxPerAnnum(Double.parseDouble(details[3]));

		return cp;

	}

}
