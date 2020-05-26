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

        // Test Case 4
        AmazonNewReleases();

        // Test Case 5
        AmazonFindaGift();


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

    public static void AmazonCustomerService() throws InterruptedException {
        // Test Case 3:Check that the  customer is able to navigate to the Customer Service button in the main page to
        // check his orders
        driver.get(url);

        // click on the customer service button
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(2000);
        // Click and test on "Where's my stuff" button
        driver.findElement(By.linkText("Where's My Stuff?")).click();
        Thread.sleep(2000);
        // Click on "Find a Missing Package that Shows as Delivered" to see if it works well as expected
        driver.findElement(By.linkText("Find a Missing Package that Shows as Delivered")).click();
        Thread.sleep(2000);
        // navigate to the HelpSearchBox and write and not correct package number "123456789"
        driver.findElement(By.xpath("//input[@id='helpsearch']")).sendKeys("123456789");
        Thread.sleep(2000);
        // Click on "GO" button to get a message "No results match your search for "123456789" in Amazon.com Help."
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
    }

    public static void AmazonNewReleases() throws InterruptedException {
        // Test Case 4:Check that the customer is able to navigate to the NewRelease button in the main page to
        // put one of his products in shopping cart
        driver.get(url);

        //testing New Releases button and click on it
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        Thread.sleep(2000);
        // The customer choose one of the products "All-new Ring Video Doorbell 3" and click on to test it
        driver.findElement(By.xpath("//div[contains(text(),'All-new Ring Video Doorbell 3')]")).click();
        Thread.sleep(2000);
        // it will open a new page for "All-new Ring Video Doorbell 3" product then the customer will click on
        // quantity button to test it
        driver.findElement(By.id("a-autoid-0-announce")).click();
        Thread.sleep(2000);
        // customer will choose 3 "All-new Ring Video Doorbell 3"
        driver.findElement(By.xpath("//a[@id='quantity_2']")).click();
        Thread.sleep(2000);
        // the customer will click on "add to cart" button who will open shopping cart page
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);
    }
    public static void AmazonFindaGift() throws InterruptedException {
        // Test Case 5:Check that the customer is able to navigate to the "FindaGift" button in the main page to
        // to choose one gift for men
        driver.get(url);

        //Navigate FindaGift button and click on it

            driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
            Thread.sleep(2000);





            //testing Today's Deals button
            driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
            Thread.sleep(2000);


        }


    }


