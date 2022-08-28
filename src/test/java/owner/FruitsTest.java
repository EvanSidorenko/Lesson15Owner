package owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.FruitsConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {
    @Test
    public void testArray() {
        System.setProperty("array", "apple,orange,banana");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsArray())
                .containsExactly("apple","orange","banana");
    }
    @Test
    public void testList() {
        System.setProperty("list", "apple,orange,banana");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsList())
                .containsExactly("apple","orange","banana");
    }
    @Test
    public void testListDefault() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListDefault())
                .containsExactly("apple","banana");
    }
    @Test
    public void testSeparator() {
        System.setProperty("separator", "apple;orange");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getSeparator())
                .containsExactly("apple","orange");
    }

}
