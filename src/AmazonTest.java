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
      //  checkAmazonFreshPageIsLoaded();

        // Test Case 2
    //    AmazonBestSellers();

        // Test Case 3
     //   AmazonCustomerService();

        // Test Case 4
     //   AmazonNewReleases();

        // Test Case 5
     //   AmazonFindaGift();

        // Test Case 6
     //   AmazonTodaysDeals();

        // Test Case 7
     //   HelloSelectYourAddress();

        // Test Case 8
     //   HelloSignIn();

        // Test Case 9
        ScrolDownMenu();


    }

    public static void checkAmazonFreshPageIsLoaded() throws InterruptedException {

        // Test Case 1: Check that the  customer is able to navigate to the SearchBox in the main page
        driver.get(url);

        // Click on the search menu
        driver.findElement(By.cssSelector("#searchDropdownBox")).click();

        // move mouse pointer to the DropDown Menu to "AmazonFresh"
        driver.findElement(By.xpath("//option[contains(text(),'Amazon Fresh')]")).click();
        //Adding wait
        Thread.sleep(2000);

        // click on search box and write "Carrots"
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Carrots");
        //Adding wait
        Thread.sleep(2000);

        //click on the search button to start the search showing the results for "Carrots"
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        //Adding wait
        Thread.sleep(2000);



    }

    public static void AmazonBestSellers() throws InterruptedException {

        // Test Case 2:Check that the  customer is able to navigate to the bestSellers button in the main page
        driver.get(url);

        // Click on the BestSellers Button
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        //Adding wait
        Thread.sleep(2000);
        //testing NewReleases button
        driver.findElement(By.xpath("//*[@id=\"zg_tabs\"]/ul/li[2]/div/a")).click();
        //Adding wait
        Thread.sleep(2000);
        // choose "theLastOfUsPart2" CD for PlayStation
        driver.findElement(By.linkText("The Last of Us Part II - PlayStation 4")).click();
        //Adding wait
        Thread.sleep(2000);
    }

    public static void AmazonCustomerService() throws InterruptedException {
        // Test Case 3:Check that the  customer is able to navigate to the Customer Service button in the main page to
        // check his orders
        driver.get(url);

        // click on the customer service button
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        //Adding wait
        Thread.sleep(2000);
        // Click and test on "Where's my stuff" button
        driver.findElement(By.linkText("Where's My Stuff?")).click();
        //Adding wait
        Thread.sleep(2000);
        // Click on "Find a Missing Package that Shows as Delivered" to see if it works well as expected
        driver.findElement(By.linkText("Find a Missing Package that Shows as Delivered")).click();
        //Adding wait
        Thread.sleep(2000);
        // navigate to the HelpSearchBox and write and not correct package number "123456789"
        driver.findElement(By.xpath("//input[@id='helpsearch']")).sendKeys("123456789");
        //Adding wait
        Thread.sleep(2000);
        // Click on "GO" button to get a message "No results match your search for "123456789" in Amazon.com Help."
        driver.findElement(By.className("a-button-input")).click();
        //Adding wait
        Thread.sleep(2000);
    }

    public static void AmazonNewReleases() throws InterruptedException {
        // Test Case 4:Check that the customer is able to navigate to the NewRelease button in the main page to
        // put one of his products in shopping cart
        driver.get(url);

        //testing New Releases button and click on it
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        //Adding wait
        Thread.sleep(2000);
        // The customer choose one of the products "All-new Ring Video Doorbell 3" and click on to test it
        driver.findElement(By.xpath("//div[contains(text(),'All-new Ring Video Doorbell 3')]")).click();
        //Adding wait
        Thread.sleep(2000);
        // it will open a new page for "All-new Ring Video Doorbell 3" product then the customer will click on
        // quantity button to test it
        driver.findElement(By.id("a-autoid-0-announce")).click();
        //Adding wait
        Thread.sleep(2000);
        // customer will choose 3 "All-new Ring Video Doorbell 3"
        driver.findElement(By.xpath("//a[@id='quantity_2']")).click();
        //Adding wait
        Thread.sleep(2000);
        // the customer will click on "add to cart" button who will open shopping cart page
        driver.findElement(By.id("add-to-cart-button")).click();
        //Adding wait
        Thread.sleep(2000);
    }
    public static void AmazonFindaGift() throws InterruptedException {
        // Test Case 5:Check that the customer is able to navigate to the "FindaGift" button in the main page to
        // to choose one gift for men
        driver.get(url);

        //Navigate FindaGift button and click on it
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        //Adding wait
        Thread.sleep(2000);
        //Customer will choose "men" for shopping
        driver.findElement(By.xpath("//span[@class='sc-ifAKCX klodVp'][contains(text(),'Men')]")).click();
        //Adding wait
        Thread.sleep(2000);
        //Customer will choose "popular mechanics" for shopping
        driver.findElement(By.xpath("//span[contains(text(),'Popular Mechanics')]")).click();
        //Adding wait
        Thread.sleep(2000);
        //will open another page for the customer who will choose "Kindle 5$" button
        driver.findElement(By.id("a-autoid-3-announce")).click();
        //Adding wait
        Thread.sleep(2000);
    }
    public static void AmazonTodaysDeals() throws InterruptedException {
        // Test Case 6:Check that the customer is able to navigate to the "TodaysDeals" button in the main page to
        // to choose one product from Beauty Department
        driver.get(url);

        //Navigate TodaysDeals button to open the page sucsefully
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        //Adding wait
        Thread.sleep(2000);
        //Navigate to the left side of the page to departments ---> Beauty
        driver.findElement(By.xpath("//span[@class='a-label a-checkbox-label'][contains(text(),'Beauty')]")).click();
        //Adding wait
        Thread.sleep(2000);
        // Customer will navigate to choose "GLO Brilliant Deluxe Teeth Whitening Device Kit" to add to his cart
        driver.findElement(By.id("101 23d5e95d-announce")).click();
        //Adding wait
        Thread.sleep(2000);
        // Customer will navigate to the top right of his page to check his Cart
        driver.findElement(By.id("nav-cart")).click();
        //Adding wait
        Thread.sleep(2000);
        // it will open a new page for the purchase process  then the customer will click on
        // quantity button to test it
        driver.findElement(By.xpath("//span[@class='sc-action-quantity']//span[@class='sc-invisible-when-no-js']")).click();
        //Adding wait
        Thread.sleep(2000);
        // customer will choose 3 "All-new Ring Video Doorbell 3"
        driver.findElement(By.id("dropdown1_9")).click();
        //Adding wait
        Thread.sleep(2000);
    }
    public static void HelloSelectYourAddress() throws InterruptedException {
        // Test Case 7:Check that the customer is able to navigate to the "HelloSelectYourAddress" button in the main
        // page to enter a US zipcode
        driver.get(url);

        //Navigate HelloSelectYourAddress button on the top left to open the page sucsefully
        driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 a-popover-trigger a-declarative']")).click();
        Thread.sleep(2000);
        // navigate to the SearchBox and enter a zipcode number "10128"
        driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("10128");
        Thread.sleep(2000);
        //click on "Apply" button
        driver.findElement(By.xpath("//span[@id='GLUXZipUpdate']//input[@class='a-button-input']")).click();
        Thread.sleep(2000);
        // Customer will click on "Done" button
        driver.findElement(By.name("glowDoneButton")).click();
        Thread.sleep(2000);
    }
    public static void HelloSignIn() throws InterruptedException {
        // Test Case 8:Check that the customer is able to navigate to the "HelloSignIn" button in the main
        // page to enter a US zipcode
        driver.get(url);

        //Navigate HelloSignIn button on the top right to open the HelloSignIn page sucsefully
        driver.findElement(By.id("nav-link-accountList")).click();
        //Adding wait
        Thread.sleep(2000);
        // navigate to the SignIn Box and enter an Email or phone number Customer will enter an email "joebary2008@gmail.com
        // "
        driver.findElement(By.id("ap_email")).sendKeys("youssefgomaa@live.co.uk");
        //Adding wait
        Thread.sleep(2000);
        //Customer have to click Continue button to continue the process to sign in to his account
        driver.findElement(By.id("continue")).click();
        //Adding wait
        Thread.sleep(2000);
        //A new page will open to the customer to enter his password , the customer will enter a not valid password
        driver.findElement(By.id("ap_password")).sendKeys("123456789HGW");
        //Adding wait
        Thread.sleep(4000);
        //Customer have to click "SignIn" button to continue the process to sign in to his account
        //A message will appear on the page "There was a problem Your password is incorrect"
        driver.findElement(By.id("signInSubmit")).click();
        //Adding wait
        Thread.sleep(2000);
    }
    public static void ScrolDownMenu() throws InterruptedException {
        // Test Case 9:Check that the customer is able to navigate to the "ScrolDownMenu" button in the Top Left corner
        // page to watch a trailer from PrimeVideo
        driver.get(url);

        // Customer will navigate to the top left corner for the Hamburger menu and click
        driver.findElement(By.id("nav-hamburger-menu")).click();
        //Adding wait
        Thread.sleep(2000);
        // Customer will choose Prime Video Link and click
        driver.findElement(By.xpath("//div[@id='hmenu-container']//li[2]//a[1]")).click();
        //Adding wait
        Thread.sleep(2000);
        // Customer will choose Prime Video Link and click
        driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']//li[3]//a[1]")).click();
        //Adding wait
        Thread.sleep(2000);
        // Customer will choose click on "home" button
        driver.findElement(By.linkText("Home")).click();
        //Adding wait
        Thread.sleep(10000);
        // Customer will try to see more and click on "see more" link
        driver.findElement(By.cssSelector("body.a-m-us.a-aui_149818-c.a-aui_152852-c.a-aui_157141-c.a-aui_158613-c.a-aui_160684-c.a-aui_57326-c.a-aui_72554-c.a-aui_accessibility_49860-c.a-aui_attr_validations_1_51371-c.a-aui_bolt_62845-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_113788-c.a-aui_ux_114039-c.a-aui_ux_138741-c.a-aui_ux_145937-c.a-aui_ux_60000-c.a-meter-animate:nth-child(2) div.DVWebNode-storefront-wrapper.DVWebNode:nth-child(34) div.HBiJOe.tst-storefront.min-width-storefront div._1gQKv6.u-collection.tst-collection._3WQsXf div.U9e8d-.tst-superhero div._2JV8iu ul.tst-superhero-item.GkEa7S._205F8a:nth-child(2) div._3HttYC._2p9a-k._3k4zTT.tst-hero-element div._6MRk7Z._34hxCj.tst-video-overlay:nth-child(2) div.QJp_50 a._2KTV2l._3g4RBC.tst-video-overlay-player-overlay.tst-preroll-player._2WYVaZ > a._2WtXeV.tst-video-overlay-player-muted")).click();
        Thread.sleep(5000);

    }



        //Close the main page
        driver.close();








    }

        }





