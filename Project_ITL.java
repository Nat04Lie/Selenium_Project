package project_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Project_ITL {

	WebDriver driver; 

	Project_ITL (WebDriver driver){

		this.driver = driver;
	}
//form filling, default check 
	WebElement firstName () {
		return driver.findElement(By.name("f_name"));
	}
	void typefirstName (String string) {
		firstName ().sendKeys(string);
	}

	String firstNameValue() {
		return firstName().getAttribute("value");
	}

	WebElement lastName () {
		return driver.findElement(By.name("l_name"));
	}
	void typelastName (String string) {
		lastName ().sendKeys(string);
	}
	String lastNameValue() {
		return lastName().getAttribute("value");
	}


	WebElement PhoneNumber () {
		return driver.findElement(By.name("phone"));
	}
	void typePhoneNumber (String string) {
		PhoneNumber ().sendKeys(string);
	}
	String PhoneNumberValue() {
		return PhoneNumber().getAttribute("value");
	}


	WebElement eMail () {
		return driver.findElement(By.name("email"));
	}
	void typeeMail (String string) {
		eMail ().sendKeys(string);
	}
	String eMailValue() {
		return eMail().getAttribute("value");
	}

//checked check-box agree
	WebElement aGree () {
		return driver.findElement(By.name("agree_check"));
	}
	void checkboxAgree() { 
		aGree().click();
	}
	boolean agreeValue () {
		return aGree().isSelected();
	}


	WebElement meSsage () {
		return driver.findElement(By.cssSelector("textarea"));
	}
	void typemeSsage (String string) {
		meSsage ().sendKeys(string);
	}
	String meSsageValue() {
		return meSsage().getAttribute("value");
	}

//click and send
	WebElement submitSend () {
		return driver.findElement(By.name("submit"));
	}
	void submit() { 
		submitSend().click();
	}

// count radio buttons 
	int radioSize() {
		return driver.findElements(By.cssSelector("input[type=checkbox]")).size();

	}
// count checkbox
	int checkboxSize() {
		return driver.findElements(By.cssSelector("input[type=\"radio\"]")).size();

	}

// check if the text in contact page is equals, check  the link "contact us"  

	WebElement contantContact (){
		return driver.findElement(By.cssSelector("[id=\"thanks\"]"));
	}

	String checkContant () {
		return	contantContact ().getText();
	}

	WebElement contactUs() {
		return driver.findElement(By.cssSelector("[href=\"contact.i.t.l.html\"]"));
	}
	void contactclick () {
		contactUs().click();
	}

	//	List<WebElement> homepageOption =  driver.findElements(By.cssSelector("[href='Home.i.t.l.html']"));
	//	
	//	void homepage() { 
	//		homepageOption.get(2).click(); 




}
