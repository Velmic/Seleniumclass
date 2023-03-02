package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();//creating instance
        driver.get("http://www.google.com");//Lunching browser
       String title =driver.getTitle();//title of the page
        System.out.println(title);
       String Url =driver.getCurrentUrl();//getting url of the page
        System.out.println(Url);
        driver.close();//closing browser






    }
}
