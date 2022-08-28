package owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {
    @DefaultValue("https://github.com")
    @Key("baseURL")
    String getBaseURL();
    @DefaultValue("CHROME")
    @Key("browser")
    Browser getBrowser();
    @DefaultValue("http://localhost:4444/wd/hub")
    @Key("remoteURL")
    URL getRemote();
}
