package owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.Browser;
import owner.config.TypesConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class TypesTest {
    @Test
    public void testInteger() {
        System.setProperty("integer", "1");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getInteger()).isEqualTo(10);
    }
    @Test
    public void testDouble() {
        System.setProperty("double", "10.10");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getDouble()).isEqualTo(10.10);
    }
    @Test
    public void testBoolean() {
        System.setProperty("boolean", "true");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getBoolean()).isEqualTo(true);
    }
    @Test
    public void testEnum() {
        System.setProperty("enum", "CHROME");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getEnum()).isEqualTo(Browser.CHROME);
    }
    @Test
    public void testURL() {
        System.setProperty("url", "http://localhost:4444/wd/hub");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getURL())
                .hasHost("localhost")
                .hasProtocol("http");
    }
    @Test
    public void testString() {
        System.setProperty("string", "stringExample");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getString()).isEqualTo("stringExample");
    }

}
