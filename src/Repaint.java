import java.util.EventListener;

// Define la interfaz del evento
interface Repaint extends EventListener {
    void onComprarClicked();
}

// Define el evento
class ComprarEvent {
    private Object source;

    public ComprarEvent(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }
}
