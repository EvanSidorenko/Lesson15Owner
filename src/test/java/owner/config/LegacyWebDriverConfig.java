package owner.config;

import java.util.Objects;

public class LegacyWebDriverConfig {
    public Browser getBrowser() {
        // зачитываем данные из командной строки
        String browser = System.getProperty("browser");
        // обрабатываем дефолтное значение
        if(Objects.isNull(browser)) {
            browser = "CHROME";
        }
        // конвертируем в возращаемый тип
        return Browser.valueOf(browser);
    }
    public String getBaseURL() {
        // зачитываем данные из командной строки
        String baseURL = System.getProperty("baseURL");
        // обрабатываем дефолтное значение
        if (Objects.isNull(baseURL)) {
            baseURL = "https://github.com";
        }
        // конвертируем в возращаемый тип
        return baseURL;
    }

}
