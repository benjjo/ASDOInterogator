import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ControlPanel controlPanel;

    public MainFrame(String title){
        super(title);

        // Set the layout manager
        setLayout(new BorderLayout()); // BorderLayout just lets you add components to top, left and centre of the frame.

        final JTextArea textArea = new JTextArea();
        ControlPanel.addControlPanelListener(new CPListener(){
            public void controlPanelEventOccurred(CPEvent event) {
                String text = event.getText();
                textArea.append(text);
            }
        });
        controlPanel = new ControlPanel("Control Panel");

        // Add Swing components to the content pane
        Container c = getContentPane();
        c.add(textArea, BorderLayout.CENTER);
        c.add(controlPanel, BorderLayout.WEST);
    }
}