package owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    private WebDriver webDriver = new WebDriverProvider().get();

    @Test
    public void testGithubGradle(){
        // Код выполнения теста
        String title = webDriver.getTitle();
        assertEquals(title, "GitHub: Where the world builds software · GitHub");
        webDriver.quit();
    }
    @AfterEach
    public void stopDriver() {
        webDriver.quit();
    }
}
