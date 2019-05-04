import BotHandler.TakeConnection;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

/**
 * @author Yevhenii Savosta
 * @version 0.0.1
 * @date 04 of May of 2019
 */

public class Main {
    public static void main (String[] strings) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        try {
            telegramBotsApi.registerBot(new TakeConnection());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
