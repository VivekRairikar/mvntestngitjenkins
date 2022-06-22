package vrr.mvntestngitjenkins;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fIS = new FileInputStream(
				"C:\\Users\\vivek\\eclipse-workspace\\mvntestngitjenkins\\src\\main\\java\\data.properties");
		prop.load(fIS);
		String bName = prop.getProperty("browser");
		if (bName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (bName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		return driver;
	}

}
