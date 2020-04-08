package crashcar.main;


import org.crashcar.botapi.Bot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

//import javax.management.remote.rmi._RMIConnection_Stub;


public class Main {
    public static void main(String[] args) {

        ApiContextInitializer.init();

        TelegramBotsApi telegramBotsApi= new TelegramBotsApi();

        try{
            telegramBotsApi.registerBot(new Bot());
        }
        catch (TelegramApiException e) {e.printStackTrace();}

        System.out.println("Запуск прошел успешно");


//            try (Session session = SessionUtil.getSession()) {
//
//                session.beginTransaction();
//
//
//
//                session.getTransaction().commit();}
//
//            catch (Throwable cause) { cause.printStackTrace(); }

    }
}
