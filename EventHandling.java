import java.awt.*;
import java.awt.event.*;
public class EventHandling extends Frame implements ActionListener {
    Button clickButton;
    Label messageLabel;

    public EventHandling() {
        // Create components
        clickButton = new Button("Click Me!");
        messageLabel = new Label("Welcome!");

        // Add components to frame
        add(clickButton);
        add(messageLabel);

        // Register listener
        clickButton.addActionListener(this);

        // Set frame properties
        setLayout(new FlowLayout());
        setSize(500, 200);
        setVisible(true);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {
        messageLabel.setText("Button was clicked!");
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}
