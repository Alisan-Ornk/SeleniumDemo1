package FirstCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getgoogle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driven = new ChromeDriver();

        driven.get("https://www.google.com/");

    }
}
