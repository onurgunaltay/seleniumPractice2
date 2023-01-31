import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/onur.guneltay/Downloads/chromedriver 2");

        //webdriver.chrome.driver
        //WebDriver driver = new ChromeDriver();

        //Firefox Launch
        //geckodriver

        //webdriver.gecko.driver

        System.setProperty("webdriver.gecko.driver","/Users/onur.guneltay/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        //driver.quit();
    }
}
