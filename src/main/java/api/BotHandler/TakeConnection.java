package api.BotHandler;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TakeConnection extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage());
    }

    @Override
    public String getBotUsername() {
        return TakeData.GET_BOT_USERNAME();
    }

    @Override
    public String getBotToken() {
        return TakeData.GET_BOT_TOKEN();
    }
}
