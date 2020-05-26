import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class AmazonTest {

    public static WebDriver driver = new ChromeDriver();
    public static String chromeDriver = "webdriver.chrome.driver";
    public static String chromeDriverPath = "BrowserDriver/mac/chromedriver";
    public static String url = "http://www.amazon.com";


    public static void main(String[] args) throws InterruptedException {
        // Test Case 1
        checkAmazonFreshPageIsLoaded();

        // Test Case 2
        AmazonBestSellers();

        // Test Case 3
        AmazonCustomerService();


    }

    public static void checkAmazonFreshPageIsLoaded() throws InterruptedException {

        // Test Case 1: Check that the  customer is able to navigate to the SearchBox in the main page
        driver.get(url);

        // Click on the search menu
        driver.findElement(By.cssSelector("#searchDropdownBox")).click();

        // move mouse pointer to the DropDown Menu to "AmazonFresh"
        driver.findElement(By.xpath("//option[contains(text(),'Amazon Fresh')]")).click();
        Thread.sleep(2000);

        // click on search box and write "Carrots"
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Carrots");
        Thread.sleep(2000);

        //click on the search button to start the search showing the results for "Carrots"
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        Thread.sleep(2000);


    }

    public static void AmazonBestSellers() throws InterruptedException {

        // Test Case 2:Check that the  customer is able to navigate to the bestSellers button in the main page
        driver.get(url);

        // Click on the BestSellers Button
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        Thread.sleep(2000);

        //testing NewReleases button
        driver.findElement(By.xpath("//*[@id=\"zg_tabs\"]/ul/li[2]/div/a")).click();
        Thread.sleep(2000);

        // choose "theLastOfUsPart2" CD for PlayStation
        driver.findElement(By.linkText("The Last of Us Part II - PlayStation 4")).click();
        Thread.sleep(2000);
    }

    public static void AmazonCustomerService () throws InterruptedException {
        // Test Case 3:Check that the  customer is able to navigate to the Customer Service button in the main page to
        // check his orders
        driver.get(url);

        // click on the customer service button
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(2000);
        // Click on "Your Orders" button
        driver.findElement(By.linkText("Your Orders")).click();
        Thread.sleep(2000);







            //testing New Releases button
            driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
            Thread.sleep(2000);

            //testing Find a Gift button

            driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
            Thread.sleep(2000);

            //testing Today's Deals button
            driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
            Thread.sleep(2000);


        }


    }

