package Maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class DataPropTest {
	private static Logger log = LogManager.getLogger(DataPropTest.class.getName());

	@Test
	public void data() throws IOException

	{

		/*Properties p = new Properties();
		FileInputStream f = new FileInputStream(
				"C:\\Users\\Mr. Deepak\\Mavenjava\\src\\test\\java\\Maven\\data.properties");
		p.load(f);
		// System.out.println(p.getProperty("username"));
*/		
		log.debug("Debug");
		log.info("Success");
	}

}
