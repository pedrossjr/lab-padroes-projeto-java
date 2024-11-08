package one.digitalinnovation.gof.factory;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private String status;
    private List<Notificador> notificadors = new ArrayList<>();

    public void addNotifier(Notificador notificador) {
        notificadors.add(notificador);
    }

    public void removeNotifier(Notificador notificador) {
        notificadors.remove(notificador);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyAllNotifiers();
    }

    private void notifyAllNotifiers() {
        for (Notificador notificador : notificadors) {
            notificador.notify("Status do pedido atualizado para: " + status);
        }
    }
}
