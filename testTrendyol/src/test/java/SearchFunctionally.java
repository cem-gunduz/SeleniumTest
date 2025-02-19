import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFunctionally {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/");

       WebElement searchBox = driver.findElement(By.cssSelector("input[data-testid='suggestion']"));
       searchBox.sendKeys("kablosuz kulaklik", Keys.ENTER);

       String searchResult=driver.findElement(By.xpath("(//div[@class='dscrptn dscrptn-V2']/h1)")).getText();
       System.out.println("Arama sonucu: "+searchResult);
        if(searchResult.contains("kablosuz kulaklik")){
            System.out.println("Arama sonucu doğru");
        }else{
            System.out.println("Arama sonucu yanlış");
        }
    }
}