package seleniumLearning;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vagrant.baseClass.BaseClass;

public class AutoITTests extends BaseClass {

	@Test(enabled = false)
	public void autoItTest() throws IOException, InterruptedException {
		driver.get("https://www.toolsqa.com/automation-practice-form");

		driver.findElement(By.id("photo")).click();

		Runtime.getRuntime().exec("C:\\Users\\P10484475\\Desktop\\autoitscript.exe");

		Thread.sleep(5000);

	}
}
