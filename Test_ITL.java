package project_java;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Test_ITL {

	WebDriver driver;

	@BeforeEach
	void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0nata\\OneDrive\\Desktop\\Java\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("///C:/Users/0nata/OneDrive/Desktop/qa/HTML/project%20HTML-N.K/contact.i.t.l.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();



	}

	@Test
	void formFill() {
		Project_ITL project_itl = new Project_ITL(driver);

		project_itl.typefirstName("Natalie");
		project_itl.typelastName("Kostukevich");
		project_itl.typePhoneNumber("0547644050");
		project_itl.typeeMail("0natalie04@gmail.com");
		project_itl.typemeSsage("Hello, I'll be happy to order one perfume. Thank you!");
		project_itl.checkboxAgree();
		project_itl.submit();
		
	}

	@Test
	void formDefault() {
		Project_ITL project_itl = new Project_ITL(driver);
		assertEquals("", project_itl.firstNameValue());
		assertEquals("", project_itl.lastNameValue());
		assertEquals("", project_itl.PhoneNumberValue());
		assertEquals("", project_itl.eMailValue());
		assertEquals("", project_itl.meSsageValue());
		assertFalse(project_itl.agreeValue());

		

	}

	@Test
	void countCheckboxradiobutten() {
		Project_ITL project_itl = new Project_ITL(driver);
		driver.get("C:/Users/0nata/OneDrive/Desktop/qa/HTML/project%20HTML-N.K/choose.i.t.l.shop.html");
		assertEquals(9, project_itl.radioSize());
		assertEquals(2, project_itl.checkboxSize());
		
	}

	@Test
	void contentCheck() {
		Project_ITL project_itl = new Project_ITL(driver);
		driver.get("file:///C:/Users/0nata/OneDrive/Desktop/qa/HTML/project%20HTML-N.K/Thanks.i.t.l.html");
		assertEquals ("Thank you for getting in touch",project_itl.checkContant());
		System.out.println(project_itl.checkContant());
		project_itl.contactclick();
		
	}

	@AfterEach
	void close() {
		driver.close();
	}
}