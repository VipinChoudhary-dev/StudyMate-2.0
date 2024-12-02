import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GuessTheNumberGame extends Game {
    public void start() {
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;

        // Set up the game window
        JFrame gameFrame = new JFrame("Guess the Number");
        gameFrame.setSize(800, 700);
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gameFrame.setLayout(new BorderLayout());

        // Panel for components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Input field for user guesses
        JTextField guessField = new JTextField();
        guessField.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(guessField);

        // Label for instructions and feedback
        JLabel messageLabel = new JLabel("Guess a number between 1 and 10", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(messageLabel);

        // Submit button
        JButton guessButton = new JButton("Submit Guess");
        guessButton.setFont(new Font("Arial", Font.BOLD, 22));

        // Action listener for the button
        guessButton.addActionListener(e -> {
            try {
                int userGuess = Integer.parseInt(guessField.getText());

                if (userGuess == numberToGuess) {
                    messageLabel.setText("Correct! The number was " + numberToGuess + ".");
                    guessButton.setEnabled(false);
                    displayMessage(gameFrame, "You guessed the number! It was: " + numberToGuess);
                } else if (userGuess < numberToGuess) {
                    messageLabel.setText("Too low! Try again.");
                } else {
                    messageLabel.setText("Too high! Try again.");
                }
            } catch (NumberFormatException ex) {
                messageLabel.setText("Please enter a valid number.");
            }
        });

        panel.add(guessButton);

        // Add panel to the frame
        gameFrame.add(panel, BorderLayout.CENTER);
        gameFrame.setVisible(true);
    }
}
