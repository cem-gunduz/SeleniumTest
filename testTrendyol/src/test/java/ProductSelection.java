import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductSelection {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("input[data-testid='suggestion']"));
        searchBox.sendKeys("kablosuz kulaklik", Keys.ENTER);

        String firstName=driver.findElement(By.xpath("(//span[@class='prdct-desc-cntnr-ttl'])[1]")).getText();
        String secondName=driver.findElement(By.xpath("(//span[@class='prdct-desc-cntnr-name hasRatings'])[1]")).getText();
        String firstPrice=driver.findElement(By.xpath("(//div[@class='price-information'])[1]")).getText();

        WebElement product=driver.findElement(By.xpath("(//div[@class='p-card-chldrn-cntnr card-border'])[1]"));
        product.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        String productName=firstName+" "+secondName;
        System.out.println("İlk sayfa ürün adı: "+productName);
        System.out.println("İlk sayfa fiyatı: "+firstPrice);
    }
}
