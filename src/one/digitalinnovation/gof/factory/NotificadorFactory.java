package one.digitalinnovation.gof.factory;

public class NotificadorFactory {
    public static Notificador createNotifier(String type) {
        switch (type) {
            case "email":
                return new NotificadorEmail();
            case "sms":
                return new NotificadorSMS();
            default:
                throw new IllegalArgumentException("Tipo de notificador desconhecido: " + type);
        }
    }
}
