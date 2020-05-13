package helper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created BY Armine Movsisyan on 11 May,2020
 */
public class Config {

    public static String getConfig(String name) {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader("src/main/resources/app.properties")) {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(name);
    }

}