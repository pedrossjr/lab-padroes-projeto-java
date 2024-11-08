package one.digitalinnovation.gof.factory;

public class NotificadorEmail implements Notificador {
    @Override
    public void notify(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}