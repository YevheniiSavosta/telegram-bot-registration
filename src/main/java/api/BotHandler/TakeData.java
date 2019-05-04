package api.BotHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TakeData {
    private static Object LOAD_FILE_CONFIG(){
        FileInputStream file;
        Properties properties = new Properties();
        try{
            file = new FileInputStream("src/main/resources/config.properties");
            properties.load(file);

            return properties;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String GET_DATABASE_HOSTNAME(){
        Properties tateProperties = (Properties) TakeData.LOAD_FILE_CONFIG();
        String DATABASE_HOSTNAME = tateProperties.getProperty("DATABASE_HOSTNAME");
        return DATABASE_HOSTNAME;
    }
    public static String GET_DATABASE_PORTNUMBER(){
        Properties tateProperties = (Properties) TakeData.LOAD_FILE_CONFIG();
        String DATABASE_PORTNUMBER = tateProperties.getProperty("DATABASE_PORTNUMBER");
        return DATABASE_PORTNUMBER;
    }
    public static String GET_DATABASE_USERNAME(){
        Properties tateProperties = (Properties) TakeData.LOAD_FILE_CONFIG();
        String DATABASE_USERNAME = tateProperties.getProperty("DATABASE_USERNAME");
        return DATABASE_USERNAME;
    }
    public static String GET_DATABASE_PASSWORD(){
        Properties tateProperties = (Properties) TakeData.LOAD_FILE_CONFIG();
        String DATABASE_PASSWORD = tateProperties.getProperty("DATABASE_PASSWORD");
        return DATABASE_PASSWORD;
    }
    public static String GET_DATABASE_TABLENAME(){
        Properties tateProperties = (Properties) TakeData.LOAD_FILE_CONFIG();
        String DATABASE_TABLENAME = tateProperties.getProperty("DATABASE_TABLENAME");
        return DATABASE_TABLENAME;
    }
    public static String GET_BOT_USERNAME(){
        Properties tateProperties = (Properties) TakeData.LOAD_FILE_CONFIG();
        String BOT_USERNAME = tateProperties.getProperty("BOT_USERNAME");
        return BOT_USERNAME;
    }
    public static String GET_BOT_TOKEN(){
        Properties tateProperties = (Properties) TakeData.LOAD_FILE_CONFIG();
        String BOT_TOKEN = tateProperties.getProperty("BOT_TOKEN");
        return BOT_TOKEN;
    }
}
