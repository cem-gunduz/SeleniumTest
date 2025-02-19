import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCart {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("input[data-testid='suggestion']"));
        searchBox.sendKeys("kablosuz kulaklik", Keys.ENTER);

        WebElement product=driver.findElement(By.xpath("(//div[@class='p-card-chldrn-cntnr card-border'])[1]"));
        product.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));

        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(@class, 'add-to-basket')]"));
        addToCartButton.click();

        driver.get("https://www.trendyol.com/sepet");

        WebElement cartItem = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'pb-basket-item')]")));

        if (cartItem.isDisplayed()) {
            System.out.println("Ürün sepete başarıyla eklendi");
        } else {
            System.out.println("Ürün sepete eklenemedi");
        }
    }
}
