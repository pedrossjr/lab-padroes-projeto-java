package one.digitalinnovation.gof.factory;

public class NotificadorSMS implements Notificador {
    @Override
    public void notify(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
