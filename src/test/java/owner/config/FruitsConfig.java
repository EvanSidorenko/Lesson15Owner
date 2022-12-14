package owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig  extends Config {
    @Key("array")
    String[] getFruitsArray();

    @Key("list")
    List<String> getFruitsList();

    @Key("defaultList")
    @DefaultValue("apple, banana")
    List<String> getFruitsListDefault();

    @Key("separator")
    @Separator(";")
    List<String> getSeparator();
}
