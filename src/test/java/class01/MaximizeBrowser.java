package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();;
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");//Launching browser
        driver.manage().window().maximize();
        driver.close();

    }
}
