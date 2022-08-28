package owner.config;

import org.aeonbits.owner.ConfigFactory;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.Test;
import owner.config.AuthConfig;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthTest {
    @Test
    public void testClasspath() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

        assertThat(config.username()).isEqualTo("ivan");
        assertThat(config.password()).isEqualTo("qwerty");
    }

    @Test
    public void testLocalFile() throws IOException {
        String content = "username=secret-user\npassword=secret-pass";
        Path probsPath = Paths.get("/tmp/secret.properties");

        Files.write(probsPath, content.getBytes(StandardCharsets.UTF_8));

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

        assertThat(config.username()).isEqualTo("secret-user");
        assertThat(config.password()).isEqualTo("secret-pass");

        Files.delete(probsPath);
    }

}
