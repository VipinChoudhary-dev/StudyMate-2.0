import javax.swing.*;

public abstract class Game {
    // for starting the game
    public abstract void start();

    // for displaying messages
    protected void displayMessage(JFrame frame, String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
}
