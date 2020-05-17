import java.util.EventListener;

public interface CPListener extends EventListener {
    void controlPanelEventOccurred(CPEvent event);
}