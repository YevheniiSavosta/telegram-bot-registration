package api.MySQL;

import api.BotHandler.TakeData;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseHandler {
    private static final String DATABASE_HOSTNAME = TakeData.GET_DATABASE_HOSTNAME();
    private static final String DATABASE_PORTNUMBER = TakeData.GET_DATABASE_PORTNUMBER();

    private static final String DATABASE_USERNAME = TakeData.GET_DATABASE_USERNAME();
    private static final String DATABASE_PASSWORD = TakeData.GET_DATABASE_PASSWORD();

    private static final String DATABASE_TABLENAME = TakeData.GET_DATABASE_PASSWORD();

    public static void DataBaseCreateConnection(Update update) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://" + DATABASE_HOSTNAME + ":" + DATABASE_PORTNUMBER + "/" + DATABASE_TABLENAME + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", DATABASE_USERNAME, DATABASE_PASSWORD)){
            System.out.println("\u001B[46m" + "[S]" + "\u001B[36m" + " Good connections to database.");
        } catch (SQLException e) {
            System.out.println("\u001B[41m" + "[S]" + "\u001B[31m" + " Error connections to database.");
        }
    }
}
