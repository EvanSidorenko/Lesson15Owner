package owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.MobileConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileEndToEndTest {
    @Test
    public void testAndroid(){

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("12");
        assertThat(config.deviceName()).isEqualTo("Google Pixel");
    }
    @Test
    public void testiPhone(){

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

        assertThat(config.platformName()).isEqualTo("iOS");
        assertThat(config.platformVersion()).isEqualTo("15.2.1");
        assertThat(config.deviceName()).isEqualTo("iPhone 11");
    }
}
