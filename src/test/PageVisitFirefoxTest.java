package test;

import data.Websites;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class PageVisitFirefoxTest {

	private WebDriver driver;

	@Before
	public void createDriver() {
		
		String profileName = "cfxo";
		
		FirefoxProfile ffp = new ProfilesIni().getProfile(profileName);
		if (ffp == null)
			throw new RuntimeException("Unable to load profile: "+profileName);
		ffp.setPreference("extensions.adnauseam2@rednoise.org.automated", true);
		driver = new FirefoxDriver(ffp);
	}

	@After
	public void quitDriver() {
		driver.quit();
	}

	@Test
	public void testTopNews() {
		
		String [] testURLs = Websites.topNews;
		
		for (int i = 0; i < testURLs.length; i++) {
			driver.get(testURLs[i]);
			
			// rest of the test...
		}
	}

	@Test
	public void testTopRecreation() {
		
		String [] testURLs = Websites.topRecreation;
		
		for (int i = 0; i < testURLs.length; i++) {
			driver.get(testURLs[i]);
			
			// rest of the test...
		}
	}

	@Test
	public void testGoogleSearch() {
		driver.get("http://www.google.com");
		// rest of the test...
	}

	@Test
	public void testBingSearch() {
		driver.get("http://www.bing.com");
		// rest of the test...
	}

}
